package org.simElevatorGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FloorCanvas extends JPanel{
	
	private JButton theFloor = new JButton();
	private BorderLayout layout = new BorderLayout();
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
//		g.setColor(Color.green);
//		g.fillRect(30, 10, 50, 10);
		// why is this method not called?
		
		// set the current panel/canvas to be of BorderLayout...
		this.setLayout(layout);
		
		// the instantiation should be done in global declaration
		// so that only 1 button and layout will be used in all time.
//		theFloor = new JButton();
		theFloor.setBackground(Color.gray);
		
		//...so that the rectangle representing the ground floor
		// can be drawn at the bottom		
		this.add(theFloor, BorderLayout.SOUTH);
	}
}
