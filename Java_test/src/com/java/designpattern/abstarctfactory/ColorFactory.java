package com.java.designpattern.abstarctfactory;

public class ColorFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String colorName) {
		if(colorName.equals("red")) {
			return new Red();
		}else if (colorName.equals("green")) {
			return new Green();
		}
		return null;
	}

}
