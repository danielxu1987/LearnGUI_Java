package org.tryMouseEvent;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseTracker extends JFrame
implements MouseListener, MouseMotionListener
{
	private JLabel statusBar;
	
	public MouseTracker()
	{
		super("Demonstrating Mouse Events");
		
		statusBar = new JLabel();
		getContentPane().add(statusBar, BorderLayout.SOUTH);
		
		// application listens to its own mouse events
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setSize(300, 100);
		setVisible(true);
	}

	// MoustMotionListener event handlers
	@Override
	public void mouseDragged(MouseEvent e) {
		statusBar.setText("Dragged at [" + e.getX() +
				", " + e.getY() + "]");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// Auto-generated method stub
		statusBar.setText("Moved at [" + e.getX() +
				", " + e.getY() + "]");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText("Clicked at [" + 
				e.getX() + ", " + e.getY() + "]");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText("Pressed at [" + 
				e.getX() + ", " + e.getY() + "]");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText("Released at [" + 
				e.getX() + ", " + e.getY() + "]");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText("Mouse is inside the window");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText("Moust is outside of the window");
	}
}
