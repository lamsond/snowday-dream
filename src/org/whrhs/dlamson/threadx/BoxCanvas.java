package org.whrhs.dlamson.threadx;

import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class BoxCanvas extends JPanel{
	
	public static final int W = 1000, H = 700, NUM_BOXES = 40, GAP = 10;
	Box[] boxes;
	
	public BoxCanvas() {
		setPreferredSize(new Dimension(W, H));
		boxes = new Box[NUM_BOXES];
		
		for(int i = 0; i < boxes.length; i++) {
			boxes[i] = new Box();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int leftX = GAP / 2;
		for(Box box: boxes) {
			box.setX(leftX);
			box.draw(g);
			leftX += box.getWidth() + GAP;
		}
	}
	
	

}

