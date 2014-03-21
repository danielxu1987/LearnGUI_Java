package org.tryButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RoundButtonTest extends JFrame
{
	public RoundButtonTest()
	{
		CreateRoundButton button = new CreateRoundButton();
	    button.setBackground(Color.gray);
		
	    Container c = getContentPane();
	    c.add(button);
   
	    setSize(200, 200);
	    setVisible(true);
	}
}
