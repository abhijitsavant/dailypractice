package com.java.designpattern.composite;

public class Main {

	public static void main(String[] args) {
			Shape tri = new Triangle();
			Shape cir = new Circle();
			
			Drawing drawing = new Drawing();
			drawing.add(tri);
			drawing.add(cir);
			
			drawing.draw("Red");
			
			drawing.clear();
			
			drawing.add(tri);
			drawing.add(cir);
			drawing.draw("Green");
		
	}

}
