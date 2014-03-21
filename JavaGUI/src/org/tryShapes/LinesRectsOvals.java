package org.tryShapes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class LinesRectsOvals extends JFrame{
	private String str = "Using drawString";
	
	public LinesRectsOvals()
	{
		super("Drawing lines, rectangles and ovals");
		
		setSize(500, 200);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		// draw a red line
		g.setColor(Color.red);
		g.drawLine(5, 35, 350, 35);
		
		// draw non-filled and filled rectangles
		g.setColor(Color.blue);
		g.drawRect(5, 40, 90, 50);
		g.fillRect(100, 40, 90, 50);
		
		// draw round rectangles
		g.setColor(Color.cyan);
		g.fillRoundRect(200, 40, 90, 50, 50, 50);
		g.drawRoundRect(290, 40, 90, 50, 20, 20);
		
		// draw 3D rectangles
		g.setColor(Color.yellow);
		g.draw3DRect(5, 100, 90, 50, true);
		g.fill3DRect(100, 100, 90, 50, true);
		
		// draw ovals
		g.setColor(Color.magenta);
		g.drawOval(200, 100, 90, 50);
		g.fillOval(290, 100, 90, 50);
	}
}
