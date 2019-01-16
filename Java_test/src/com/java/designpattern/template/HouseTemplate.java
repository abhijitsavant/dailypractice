package com.java.designpattern.template;

public abstract class HouseTemplate {
	abstract void buildFoundation();
	abstract void buildWall();
	
	public  final void templateMethod() {
		 buildFoundation();
		 buildWall();
	}
}
