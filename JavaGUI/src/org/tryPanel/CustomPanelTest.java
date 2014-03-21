package org.tryPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CustomPanelTest extends JFrame{
	
	// the panel to anchor buttons
	private JPanel buttonPanel;

	// buttons to select square and circle drawing
	private JButton circle, square;

	// the canvas where drawing takes place
	private CustomPanel myCustomPanel;
	
	// constructor 
	public CustomPanelTest(){
		super("CustomPanel Test");
		
		myCustomPanel = new CustomPanel();
		myCustomPanel.setBackground(Color.green);
		
		DrawShapeHandler aHandler = new DrawShapeHandler();
		
		square = new JButton("Square");
		square.addActionListener(aHandler);

		circle = new JButton("Circle");
		circle.addActionListener(aHandler);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1, 2));
		buttonPanel.add(circle);
		buttonPanel.add(square);
		
		java.awt.Container c = getContentPane();
		
		// place the panel/canvas in the centre
		c.add(myCustomPanel, BorderLayout.CENTER);
		
		// and the buttons in the south
		c.add(buttonPanel, BorderLayout.SOUTH);
		
		setSize(500, 300);
		setVisible(true);
	}
	
	private class DrawShapeHandler implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
			if(e.getSource() == square)
				myCustomPanel.draw(CustomPanel.SQUARE);
			else if(e.getSource() == circle)
				myCustomPanel.draw(CustomPanel.CIRCLE);
		}
	}
}
