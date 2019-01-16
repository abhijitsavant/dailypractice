package com.java.designpattern.template;

public class CementConcrete extends HouseTemplate {

	@Override
	public void buildWall() {
		System.out.println("Building CementConcrete Walls");
	}

	@Override
	public void buildFoundation() {
		System.out.println("Building buildFoundation with CementConcrete");
	}

}
