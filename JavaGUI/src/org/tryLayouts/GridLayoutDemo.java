package org.tryLayouts;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo 
extends JFrame implements ActionListener
{
	private JButton buttons[];
	private String labels[] = {"one", "two", 
			"three", "four", "five", "six"};
	private boolean toggle = true;
	private Container c;
	private GridLayout grid1, grid2;
	
	public GridLayoutDemo()
	{
		super("GridLayout Demo");
		
		grid1 = new GridLayout(2, 3, 5, 5);
		grid2 = new GridLayout(3, 2);
		
		c = getContentPane();
		c.setLayout(grid1);
		
		// create and add buttons
		buttons = new JButton[labels.length];
		
		for(int i = 0; i < buttons.length; i++)
		{
			buttons[i] = new JButton(labels[i]);
			buttons[i].addActionListener(this);
			c.add(buttons[i]);
		}
		
		setSize(400, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Auto-generated method stub
		if (toggle)
			c.setLayout(grid2);
		else
			c.setLayout(grid1);
		
		toggle = !toggle;
		c.validate();
	}
}
