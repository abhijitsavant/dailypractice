package com.java.designpattern.facade;

public class Main {

	public static void main(String[] args) {
		ShapeFacade facade = new ShapeFacade();
		facade.drawCircle();
		facade.drawRectangle();
	}

}
