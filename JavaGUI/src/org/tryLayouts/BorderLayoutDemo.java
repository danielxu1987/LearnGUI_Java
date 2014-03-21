package org.tryLayouts;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame
implements ActionListener{
	
	private JButton buttons[];
	
	private String labels[] = {"North", 
			"South", "East", "West", "Centre"};
	
	private BorderLayout layout;
	
	
	public BorderLayoutDemo()
	{
		super("BorderLayout Demo");
		
		layout = new BorderLayout(5, 5);
		
		Container c = getContentPane();
		c.setLayout(layout);
		
		// instantiate button objects
		buttons = new JButton[labels.length];
		
		for(int i = 0; i < buttons.length; i++)
		{
			buttons[i] = new JButton(labels[i]);
			buttons[i].addActionListener(this);
		}
		
		// add buttons to the layout in specified positions
		c.add(buttons[0], BorderLayout.NORTH);
		c.add(buttons[1], BorderLayout.SOUTH);
		c.add(buttons[2], BorderLayout.EAST);
		c.add(buttons[3], BorderLayout.WEST);
		c.add(buttons[4], BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		for(int i = 0; i < buttons.length; i++)
		{
			if(e.getSource() == buttons[i])
				buttons[i].setVisible(false);
			else
				buttons[i].setVisible(true);
		}
		
		// re-layout the content pane
		layout.layoutContainer(getContentPane());
	}
}
