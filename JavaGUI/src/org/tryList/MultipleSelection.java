package org.tryList;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelection extends JFrame{
	
	private JList colourList, copyList;
	private JButton copy;
	private String colourNames[] = {"Black", "Blue", 
			"Cyan", "Grey", "Margenta", "Orange", 
			"Pink", "Red", "White", "Yellow"};
	
	public MultipleSelection()
	{
		super("Multiple Selection Lists");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		colourList = new JList(colourNames);
		colourList.setVisibleRowCount(5);
		colourList.setFixedCellHeight(15);
		colourList.setSelectionMode(
				ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		c.add(new JScrollPane(colourList));
		
		// create copy button
		copy = new JButton("Copy >>>");
		copy.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						// place selected values in copyList
						copyList.setListData(
								colourList.getSelectedValues());
					}
				});
		
		c.add(copy);
		
		copyList = new JList();
		copyList.setVisibleRowCount(5);
		copyList.setFixedCellWidth(100);
		copyList.setFixedCellHeight(15);
		
		copyList.setSelectionMode(
				ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		c.add(new JScrollPane(copyList));
		
		setSize(400, 150);
		setVisible(true);
	}
}
