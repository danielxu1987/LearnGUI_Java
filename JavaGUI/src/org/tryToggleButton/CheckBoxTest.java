package org.tryToggleButton;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

// CheckBox test to change text font
public class CheckBoxTest extends JFrame{

	private JTextField tField;
	private JCheckBox italic, bold;
	
	public CheckBoxTest()
	{
		super("JCheckBox Test");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		tField = new JTextField("Watch the font style change", 20);
		tField.setFont(new Font("TimesRoman", Font.PLAIN, 14));
		tField.setEditable(false);
		c.add(tField);
		
		// create checkbox objects
		bold = new JCheckBox("Bold");
		c.add(bold);
		
		italic = new JCheckBox("Italic");
		c.add(italic);
		
		CheckBoxHandler cbHandler = new CheckBoxHandler();
		bold.addItemListener(cbHandler);
		italic.addItemListener(cbHandler);
		
		setSize(250, 100);
		setVisible(true);
	}
	
	private class CheckBoxHandler implements ItemListener{
		private int valueBold = Font.PLAIN;
		private int valueItalic = Font.PLAIN;
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == bold)
			{
				if(e.getStateChange() == ItemEvent.SELECTED)
					valueBold = Font.BOLD;
				else
					valueBold = Font.PLAIN;
			}
			
			if(e.getSource() == italic)
			{
				if(e.getStateChange() == ItemEvent.SELECTED)
					valueItalic = Font.ITALIC;
				else
					valueItalic = Font.PLAIN;
			}
			
			tField.setFont(new Font("TimesRoman", valueBold + valueItalic, 14));
			tField.repaint();
		}
	}
}
