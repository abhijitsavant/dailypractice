package com.java.designpattern.flyweight;

public class Circle implements Shape {
	private String color;
	private int x,y, radius;
	
	public Circle(String color) {
		this.color = color;
	}
	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setRadious(int radious) {
		this.radius = radious;
	}

}
