package org.tryShapes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class DrawArcs extends JFrame{

	public DrawArcs()
	{
		super("Drawing Arcs");
		
		setSize(300, 200);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
		
		//start at 0 and sweep 360 degrees
		g.setColor(Color.blue);
		g.drawRect(15, 35, 80, 80);
		g.setColor(Color.black);
		g.drawArc(15, 35, 80, 80, 0, 360);
		
		// start at 0 and sweep 110 degrees
		g.setColor(Color.blue);
		g.drawRect(100, 35, 80, 80);
		g.setColor(Color.black);
		g.drawArc(100, 35, 80, 80, 0, 110);
		
		// start at 0 and sweep -270 degrees
		g.setColor(Color.blue);
		g.drawRect(185, 35, 80, 80);
		g.setColor(Color.black);
		g.drawArc(185, 35, 80, 80, 0, -270);
		
		// start at 0 and sweep 360 degrees
		g.fillArc(15, 120, 80, 40, 0, 360);
		
		// start at 270 and sweep -90 degrees
		g.fillArc(100, 120, 80, 40, 270, -90);
		
		// start at 0 and sweep -270 degrees
		g.fillArc(185, 120, 80, 40, 0, -270);
	}
}
