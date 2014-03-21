package org.tryTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldTest extends JFrame{
	private JTextField text1, text2, text3;
	private JPasswordField password;
	
	public TextFieldTest()
	{
		super("Testing JTextField and JPasswordField");
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		// construct textfield with default sizing
		text1 = new JTextField(10);
		c.add(text1);
		
		// construct textfield with default text
		text2 = new JTextField("Enter text here");
		c.add(text2);
		
		// construct textfield with default text 
		// and 20 visible elements and no event handler
		text3 = new JTextField("Uneditable text field", 20);
		text3.setEditable(false);
		c.add(text3);
		
		// construct password field with default text
		password = new JPasswordField("Hidden Text");
		c.add(password);
		
		TextfieldHandler tHandler = new TextfieldHandler();
		text1.addActionListener(tHandler);
		text2.addActionListener(tHandler);
		text3.addActionListener(tHandler);
		password.addActionListener(tHandler);
		
		setSize(325, 100);
		setVisible(true);
	}
	
//	public static void main(String args[])
//	{
//		TextFieldTest app = new TextFieldTest();
//	}
	
	
	private class TextfieldHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s = "";
			
			if(e.getSource() == text1)
				s = "text1: " + e.getActionCommand();
			else if (e.getSource() == text2)
				s = "text2: " + e.getActionCommand();
			else if (e.getSource() == text3)
				s = "text3: " + e.getActionCommand();
			else if (e.getSource() == password){
				JPasswordField pwd = (JPasswordField) e.getSource();
				s = "password: " + new String(pwd.getPassword());
			}
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
}
