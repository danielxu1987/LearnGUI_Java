package org.simElevatorGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
// forget about custom JButton class now, just draw circles first
public class FloorControlBoard extends JPanel
{
	private int envelopeLength;
	private final int xyShift = 3;
	
	
	@Override
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		// size of current component
		Dimension size = this.getSize();
		
//		// an interesting statement!
//		size.width = size.height = Math.max(size.width, size.height);
//		this.setPreferredSize(size);

		// the length of square that bounds the circle is only 
		// 1/3 of the length of current JComponent (e.g. panel)		
		envelopeLength = (int) size.width / 3;
		
		// draw the outline of the bounding envelope
		g.drawRect(xyShift + envelopeLength, xyShift + envelopeLength, 
				envelopeLength, envelopeLength);		
		
//		// when the GUI button is pressed with mouse button down
//		// highlight the GUI button's colour to light gray
//		// otherwise set the GUI button's colour to the background
//		// so that it appears to be released
//		if (getModel().isArmed())
//			g.setColor(Color.lightGray);
//		else 
//			g.setColor(getBackground());
		
		g.setColor(Color.lightGray);
		
		g.fillOval(xyShift + envelopeLength - 1, 
				xyShift + envelopeLength - 1, envelopeLength - 1, 
				envelopeLength - 1);
	}

	@Override
	protected void paintBorder(Graphics g) 
	{
		g.setColor(getForeground());
		g.drawOval(xyShift + envelopeLength, xyShift + envelopeLength,
				envelopeLength - 1, envelopeLength - 1);
	}
}
