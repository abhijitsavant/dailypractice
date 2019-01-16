package com.java.designpattern.template;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWall() {
		System.out.println("Building Wooden Walls");
	}

	@Override
	public void buildFoundation() {
		System.out.println("Building buildFoundation with Wood coating");
	}

}
