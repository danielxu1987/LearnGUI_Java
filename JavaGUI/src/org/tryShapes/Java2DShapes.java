package org.tryShapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Java2DShapes extends JFrame{
	
	public Java2DShapes()
	{
		super("Drawing Java2D Shapes");
		setSize(450, 150);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		// create 2D by casting g to Graphics2D
		Graphics2D g2d = (Graphics2D) g;
		
		// draw 2D ellipse filled with a blue-yellow gradient
		g2d.setPaint(new GradientPaint(
				5, 30, 			// x1, y1 
				Color.blue,		// initial colour 
				35, 100, 		// x2, y2
				Color.yellow, 	// end colour
				true));			// cyclic
		g2d.fill(new Ellipse2D.Double(10, 30, 70, 100));
		
		// draw 2D rectangle in red
		g2d.setPaint(Color.red);
		g2d.setStroke(new BasicStroke(10.0f));
		g2d.draw(new Rectangle2D.Double(80, 30, 70, 100));
		
		// draw 2D rounded rectangle with a buffered background
		BufferedImage buffImage = new BufferedImage(10, 10, 
				BufferedImage.TYPE_INT_RGB);
		
		Graphics2D gg = buffImage.createGraphics();
		gg.setColor(Color.yellow);  // draw in yellow
		gg.fillRect(0, 0, 10, 10);	// draw a filled rectangle
		gg.setColor(Color.black);	// draw in black
		gg.drawRect(1, 1, 6, 6);	// draw a rectangle
		gg.setColor(Color.blue);	// draw in blue
		gg.fillRect(1, 1, 3, 3);	// draw a filled rectangle
		gg.setColor(Color.red);		// draw in red
		gg.fillRect(4, 4, 3, 3);	// draw a filled rectangle
		
		// paint buffImage onto the JFrame
		g2d.setPaint(
				new TexturePaint(buffImage, new Rectangle(10, 10)));
		g2d.fill(new RoundRectangle2D.Double(160, 30, 80, 100, 50, 50));
		
		// draw 2D pie-shaped arc in dark gray
		g2d.setPaint(Color.darkGray);
		g2d.setStroke(new BasicStroke(6.0f));
		g2d.draw(new Arc2D.Double(250, 30, 80, 100, 0, 270, Arc2D.PIE));
		
		// draw 2D solid lines in green
		g2d.setPaint(Color.green);
		g2d.draw(new Line2D.Double(400, 30, 330, 150));
		
		// draw dash line in cyan
		float dashes[] = {10};
		
		g2d.setPaint(Color.cyan);
		g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND,
				BasicStroke.JOIN_ROUND, 10, dashes, 0));
		
		g2d.draw(new Line2D.Double(330, 30, 400, 150));
	}
}
