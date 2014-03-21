package org.simElevatorGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

// a subclass of RoundButton (control board) that draws 
// 2 circles, instead of only 1, within 1 rectangle
public class LiftControlBoard extends JPanel{
	
	// the circle's diameter is 1/3 of the panel's width
	// and the distance of bounding rectangle to the panel top
	// is 1/4 of the panel's height
	private final int verticalRatio = 4, horizontalRatio = 3;
	
	private final int margin = 3;
	private int rectangleWidth, rectangleHeight, 
			diameter, x1, y1, x2, y2, xRect, yRect;

	
	@Override
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		InitParameters();
		
		// draw the outline of the bounding envelope - a rectangle
		// whose height is larger than width - so that it can contain
		// 2 circles instead of only 1
		g.setColor(Color.black);
		
		g.drawRect(xRect, yRect, rectangleWidth, rectangleHeight);		

		g.setColor(Color.lightGray);
		
		// the circle on the top
		g.fillOval(x1, y1, diameter, diameter);
		
		// the circle on the bottom
		g.fillOval(x2, y2, diameter, diameter);
	}
	
	private void InitParameters()
	{
		// size of panel at initiating stage
		Dimension size = this.getSize();
		
		// the width of rectangle that bounds 2 circles is only 
		// 1/3 of the width of current panel.		
		rectangleWidth = diameter = (int) (size.width / horizontalRatio);
		
		// rectangle's height is double of its width
		rectangleHeight = rectangleWidth * 2 + margin;
		
		// specify the position of 2 circles and bounding rectangle
		xRect = x1 = x2 = rectangleWidth;
		yRect = y1 = (int) (size.height / verticalRatio);
		y2 = y1 + margin + diameter;
	}
}
