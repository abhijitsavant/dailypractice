package com.java.designpattern.facade;

public class ShapeFacade {
	private Rectangle rectangle;
	private Circle circle;
	public ShapeFacade() {
		rectangle = new Rectangle();
		circle = new Circle();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawCircle() {
		circle.draw();
	}
}
