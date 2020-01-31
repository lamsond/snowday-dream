package org.whrhs.dlamson.threadx;

import java.awt.Color;
import java.awt.Graphics;

public class Box {

	private Color color;
	private int height, width;
	private int x, y;
	
	public Box() {
		width = BoxCanvas.W / BoxCanvas.NUM_BOXES - BoxCanvas.GAP;
		height = (int) (BoxCanvas.H * Math.random());
		y = BoxCanvas.H - height;
		color = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
	
	
}
