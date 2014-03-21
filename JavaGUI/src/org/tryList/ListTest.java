package org.tryList;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListTest extends JFrame{
	private JList colourList;
	private Container c;
	
	private String colourNames[] = {"Black", "Blue", 
			"Cyan", "Grey", "Margenta", "Orange", 
			"Pink", "Red", "White", "Yellow"};
	
	private Color colours[] = {Color.black, Color.blue, 
			Color.cyan, Color.gray, Color.magenta, Color.orange,
			Color.pink, Color.red, Color.white, Color.yellow};
	
	public ListTest()
	{
		super("List Test");
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// create a list with the items in the colourName array
		colourList = new JList(colourNames);
		colourList.setVisibleRowCount(5);
		
		// do not allow multiple selections
		colourList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// add a JScrollPane enabling scrollbar at the JList to the content pane
		c.add(new JScrollPane(colourList));
		
		// set up event handler
		colourList.addListSelectionListener(
				new ListSelectionListener()
				{
					public void valueChanged(ListSelectionEvent e)
					{
						c.setBackground(colours[colourList.getSelectedIndex()]);
					}
				});
		
		setSize(400, 200);
		setVisible(true);
	}
}
