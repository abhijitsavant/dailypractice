package com.java.designpattern.bridge;

public class Main {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(new RedColor());
		Shape triangle = new Triangle(new GreenColor());
		rectangle.applyColor();
		triangle.applyColor();
	}

}
