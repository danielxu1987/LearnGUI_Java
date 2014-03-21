package org.tryLayouts;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class FlowLayoutDemo extends JFrame{
	private JButton left, centre, right;
	private Container c;
	private FlowLayout layout;
	
	public FlowLayoutDemo()
	{
		super("FlowLayout Demo");
		
		layout = new FlowLayout();
		
		c= getContentPane();
		c.setLayout(layout);
		
		left = new JButton("Left");
		left.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						layout.setAlignment(FlowLayout.LEFT);
						
						// re-align container's layout
						layout.layoutContainer(c);
					}
				});
		c.add(left);
		
		centre = new JButton("Centre");
		centre.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						layout.setAlignment(FlowLayout.CENTER);
						
						// re-align container's layout
						layout.layoutContainer(c);
					}
				});
		c.add(centre);
		
		right = new JButton("Right");
		right.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						layout.setAlignment(FlowLayout.RIGHT);
						
						// re-align container's layout
						layout.layoutContainer(c);
					}
				});
		c.add(right);
		
		setSize(400, 75);
		setVisible(true);
	}
}