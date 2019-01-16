package com.java.designpattern.template;

public class Main {
	public static void main(String arg[]) {
		HouseTemplate template = new WoodenHouse();
		template.templateMethod();
		template = new CementConcrete();
		template.templateMethod();
	}
}
