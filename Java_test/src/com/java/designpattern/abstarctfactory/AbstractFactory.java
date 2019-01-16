package com.java.designpattern.abstarctfactory;

public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
	abstract Color getColor(String colorName);
}
