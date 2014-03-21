package org.simElevatorGUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ElevatorCanvas extends JPanel
{
//	private JButton elevator;
	private final int horizontalSpace = 20, eWidth = 70, eHeight = 100;
	
	@Override
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);

		g.setColor(Color.gray);
		
		// find the x where the drawing should start
		// equal to y of panel centre minus elevator height 
		int currentY = (int) this.getHeight() / 2 - eHeight;
		
		// later this position will have to be dynamic
		g.fill3DRect(horizontalSpace, currentY, eWidth, eHeight, true);
	}
	
}
