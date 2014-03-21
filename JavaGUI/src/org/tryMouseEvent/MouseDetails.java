package org.tryMouseEvent;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class MouseDetails extends JFrame
{
	private String s = "";
	private int xPos, yPos;
	
	public MouseDetails()
	{
		super("Mouse clicks and buttons");
		
		addMouseListener(new MouseClickHandler());
		
		setSize(500, 200);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Clicked @ [" + xPos + ", " + 
				yPos + "]", xPos, yPos);
	}
	
	// inner class to handle mouse events
	private class MouseClickHandler extends MouseAdapter 
	{
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			
			xPos = e.getX();
			yPos = e.getY();
			
			// Problem! clickCount is always 1 
			// of course each click would trigger this method
			// so as long as this method is called, only 1 click
			// has been done on the JFrame
			int clickCount = e.getClickCount();
			
			String s = "Clicked " + clickCount + " time(s)";
			
			if(e.isMetaDown()) // right mouse button
				s += " with right mouse button";
			else if (e.isAltDown()) // middle mouse button
				s +=" with center mouse button";
			else // left mouse button
				s += " with left mouse button";
			
			setTitle(s); // set the title bar of the window
			repaint();
		}
	}
}
