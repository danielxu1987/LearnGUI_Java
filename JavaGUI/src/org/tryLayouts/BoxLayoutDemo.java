package org.tryLayouts;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class BoxLayoutDemo extends JFrame{
	
	public BoxLayoutDemo()
	{
		super("BoxLayout Demo");
		
		final int SIZE = 3;
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10, 10));
		
		Box boxes[] = new Box[4];
		
		boxes[0] = Box.createHorizontalBox();
		boxes[0].setBorder(new LineBorder(Color.black));
		
		boxes[1] = Box.createVerticalBox();
		boxes[1].setBorder(new LineBorder(Color.black));
		
		boxes[2] = Box.createHorizontalBox();
		boxes[2].setBorder(new LineBorder(Color.black));
		
		boxes[3] = Box.createVerticalBox();
		boxes[3].setBorder(new LineBorder(Color.black));
		
		// add buttons to boxes[0] with plain layout setting
		for (int i = 0; i < SIZE; i++)
			boxes[0].add(new JButton("boxes[0]: " + i));
		
		// create strut and add buttons to boxes[1]
		for (int i = 0; i < SIZE; i++)
		{
			boxes[1].add(Box.createVerticalStrut(25));
			boxes[1].add(new JButton("boxes[1]: " + i));
		}
		
		// create horizontal glue and add buttons to boxes[2]
		for (int i = 0; i <SIZE; i++)
		{
			boxes[2].add(Box.createHorizontalGlue());
			boxes[2].add(new JButton("boxes[2]: " + i));
		}
		
		// create rigid area and add buttons to boxes[3]
		for (int i = 0; i < SIZE; i++)
		{
			boxes[3].add(Box.createRigidArea(new Dimension(15, 10)));
			boxes[3].add(new JButton("boxes[3]: " + i));
		}
		
		// create horizontal glue and add buttons to panel
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		for (int i = 0; i < SIZE; i++)
		{
			panel.add(Box.createGlue());
			panel.add(new JButton("panel: " + i));
		}
		
		// place panels on frame
		c.add(boxes[0], BorderLayout.NORTH);
		c.add(boxes[1], BorderLayout.EAST);
		c.add(boxes[2], BorderLayout.SOUTH);
		c.add(boxes[3], BorderLayout.WEST);
		c.add(panel, BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
	}
}
