package com.java.designpattern.abstarctfactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equals("circle")) {
			return new Circle();
		}else if (shapeType.equals("rectangle")) {
			return new Rectangle();
		}
		return null;
	}

	@Override
	Color getColor(String colorName) {
		return null;
	}

}
