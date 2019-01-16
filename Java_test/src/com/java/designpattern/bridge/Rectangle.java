package com.java.designpattern.bridge;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.print("Rectangle filled with color ");
		color.applyColor();
	}

}
