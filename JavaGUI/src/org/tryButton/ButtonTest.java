package org.tryButton;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// Test Buttons and its function with icons
public class ButtonTest extends JFrame{

	private JButton plainButton, fancyButton;
	
	public ButtonTest()
	{
		super("Testing Buttons");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// create buttons 
		plainButton = new JButton("Plain Button");
		c.add(plainButton);
		
		Icon bug1 = new ImageIcon(ButtonTest.class.getResource("/org/tryButton/bug1.gif"));
		Icon bug2 = new ImageIcon(ButtonTest.class.getResource("/org/tryButton/bug2.gif"));
		fancyButton = new JButton("Fancy Button", bug1);
		fancyButton.setRolloverIcon(bug2);
		c.add(fancyButton);
		
		// create an instance of inner class ButtonHandler
		// to use for button event handling
		ButtonHandler bHandler = new ButtonHandler();
		fancyButton.addActionListener(bHandler);
		plainButton.addActionListener(bHandler);
		
		setSize(300, 100);
		setVisible(true);
	}
	
	
	// inner class for Button event handling
	private class ButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			// inform the user what he just pressed
			JOptionPane.showMessageDialog(null, 
					"You pressed: " + e.getActionCommand());
		}
	}
}
