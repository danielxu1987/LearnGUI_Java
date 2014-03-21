package org.tryPanel;

import java.awt.Graphics;
import javax.swing.JPanel;


public class CustomPanel extends JPanel
{	
	public final static int CIRCLE = 1, SQUARE = 2;
	private int shape;
	
	/* The new paintComponent method should 
	 * draw a single line representing the floor. 
	 * Each floor should own an object of such.*/
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
//		// additional functions
//		g.fillRect(x, y, width, height);
		if(shape == CIRCLE)
		{
			g.fillOval(100, 10, 60, 60);
		}
		else if(shape == SQUARE)
		{
			g.fillRect(100, 10, 60, 60);
		}
	}
	
	public void draw(int s)
	{
		shape = s;
		repaint();
	}
}
