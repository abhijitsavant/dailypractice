package com.java.designpattern.builder;

public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("500GB").setGraphicEnabled(true).build();
		System.out.println(computer);
	}

}
