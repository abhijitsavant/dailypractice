package com.java.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private static final Map<String , Circle> circles = new HashMap<>();
	
	public static Circle getCircle(String color) {
		Circle circle = circles.get(color);
		if(circle != null) {
			return circle;
		}else {
			circle = new Circle(color);
			circles.put(color, circle);
			System.out.println("created new circle");
		}
		return circle;
	}
}
