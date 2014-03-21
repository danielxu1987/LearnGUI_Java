package org.simElevatorGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import org.simElevatorGUI.ClockCanvas;
import org.simElevatorGUI.ElevatorCanvas;
import org.simElevatorGUI.FloorCanvas;


public class ElevatorNFloorsTest extends JFrame
{
	private ElevatorCanvas elevator;
	private JPanel floorSpace;
	private FloorCanvas floor1, floor2;
	private ClockCanvas clock;
	private JButton callButton1, callButton2;
	private JPanel controlCanvas;
	private FloorControlBoard floorboard1, floorboard2;
	private LiftControlBoard liftControlBoard;
	
	
	public ElevatorNFloorsTest()
	{
		super("Elevator Canvas Test");
		
		// initialise the main container
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 5));
	
		LineBorder bigLine = new LineBorder(Color.black, 2);
		LineBorder mediumLine = new LineBorder(Color.black, 1);	
		
		Box boxes[] = new Box[2];
		
		// tell the components to lay out horizontally
		// boxes[0] is for the components shown above
		boxes[0] = Box.createHorizontalBox();
		
		// boxes[1] is for the two buttons - Floor1 and Floor2
		boxes[1] = Box.createHorizontalBox();
//		boxes[1].add(Box.createVerticalStrut(40));
		
		// initialise clock canvas
		clock = new ClockCanvas();
		clock.setBorder(bigLine);

		// initialise a floor canvas to hold 2 floors
		floorSpace = new JPanel();
		floorSpace.setLayout(new GridLayout(2, 1));
		floorSpace.setBorder(bigLine);
		
		// initialise 2st floor, on the top
		floor2 = new FloorCanvas();
		floor2.setBorder(mediumLine);
		floorSpace.add(floor2);
		
		// initialise 1st floor, on the bottom
		floor1 = new FloorCanvas();
		floor1.setBorder(mediumLine);
		floorSpace.add(floor1);
		
		// initialise elevator canvas 
		elevator = new ElevatorCanvas();
		elevator.setBorder(bigLine);
		
		// initialise control board canvas with 3 rows and 1 column
		controlCanvas = new JPanel(new GridLayout(3, 1));
		controlCanvas.setBorder(bigLine);
		
		// initialise 3 independent drawing regions
		// control board for floor 1 and 2 and elevator
		floorboard1 = new FloorControlBoard();
		floorboard1.setBorder(mediumLine);
		controlCanvas.add(floorboard1);

		liftControlBoard = new LiftControlBoard();
		liftControlBoard.setBorder(mediumLine);
		controlCanvas.add(liftControlBoard);
		
		floorboard2 = new FloorControlBoard();
		floorboard2.setBorder(mediumLine);
		controlCanvas.add(floorboard2);
		
		// the order determines the position of components
		boxes[0].add(clock);
		boxes[0].add(floorSpace);
		boxes[0].add(elevator);
		boxes[0].add(controlCanvas);
		
		// initialise two buttons to be at the bottom - 
		// contained in boxes[1]
		callButton1 = new JButton("Floor 1");
		callButton2 = new JButton("Floor 2");
		
		// give some space to the left of the 1st button
		boxes[1].add(Box.createHorizontalGlue());
		boxes[1].add(callButton1);
		
		// keep a space in between 2 buttons
		boxes[1].add(Box.createHorizontalGlue());
		boxes[1].add(callButton2);
		
		// give also space to the right of the 2nd button
		boxes[1].add(Box.createHorizontalGlue());

		c.add(boxes[0], BorderLayout.CENTER);
		c.add(boxes[1], BorderLayout.SOUTH);
		
		setSize(500, 300);
		setVisible(true);
	}
}
