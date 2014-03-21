package org.tryMouseEvent;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter extends JFrame{
	
	private class MouseMotionHandler extends MouseMotionAdapter
	{
		@Override
		public void mouseDragged(MouseEvent e) 
		{
			// TODO Auto-generated method stub
			super.mouseDragged(e);
			
			xValue = e.getX();
			yValue = e.getY();
			repaint();
		}
	}

	private int xValue = -10, yValue = -10;
	
	public Painter()
	{
		super("A simple paint programe");
		
		getContentPane().add(new JLabel("Drag the mouse to draw"),
				BorderLayout.SOUTH);
		
		MouseMotionHandler mmHandler = new MouseMotionHandler();
		addMouseMotionListener(mmHandler);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.fillRect(xValue, yValue, 4, 4);
	}
}
