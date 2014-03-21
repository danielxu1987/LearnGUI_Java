package org.simElevatorGUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ClockCanvas extends JPanel{

	private final int topLeftX = 20, topLeftY = 20, 
			startAngle = 0, sweepAngle = 360;
	
	private int clockDiameter;
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		// set the circle that represents the clock to be
		// a little smaller than the width of its container
		clockDiameter = this.getSize().width - topLeftX * 2;
		
		g.setColor(Color.darkGray);
		g.drawArc(topLeftX, topLeftY, clockDiameter, 
				clockDiameter, startAngle, sweepAngle);
		
		drawHand(g);
	}
	
	private void drawHand(Graphics g)
	{
		// draw the hands of the clock
		int xyHand = topLeftX + (int) clockDiameter / 2;
		
		g.setColor(Color.black);
		g.drawLine(xyHand, topLeftY, xyHand, xyHand);
	}
}
