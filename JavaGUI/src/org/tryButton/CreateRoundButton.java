package org.tryButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JPanel;

	
public class CreateRoundButton extends JButton
{
	private Shape shape;
	
	public CreateRoundButton() 
	{		
		super();
		
		// size of current panel
		//Dimension size = getPreferredSize();		
		Dimension size = new Dimension(30, 30);
		
		// an interesting statement!
//		size.width = size.height = Math.max(size.width, size.height);
		
//		setPreferredSize(size);
		setSize(size);
		
		// set value to false to create transparent button
		setContentAreaFilled(false);
	}

	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
  	
		g.drawRect(0, 0, getWidth(), getHeight());
		
		// when the GUI button is pressed with mouse button down
		// highlight the GUI button's colour to light gray
		// otherwise set the GUI button's colour to the background
		// so that it appears to be released
		if (getModel().isArmed())
			g.setColor(Color.lightGray);
		else 
			g.setColor(getBackground());
	  
		g.fillOval(0, 0, getWidth() - 1, getHeight() - 1);
	}

	@Override
	protected void paintBorder(Graphics g) 
	{
		g.setColor(getForeground());
		g.drawOval(0, 0, getWidth() - 1, getHeight() - 1);
	}

	@Override
	public boolean contains(int x, int y) 
	{
		// what does this line mean?
		if (shape == null || !shape.getBounds().equals(getBounds()))
			shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
		  
		return shape.contains(x, y);
	}
}
