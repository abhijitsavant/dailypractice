package com.java.designpattern.composite;

public class Triangle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing triangle with color : "+color);
	}

}
