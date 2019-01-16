package com.java.designpattern.prototype;

import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee();
		e1.loadEmployeeNames();
		System.out.println("Original list : "+e1.getNames());
		Employee e2 = e1.clone();
		List<String> names = e2.getNames();
		names.add("D");
		System.out.println("Original list : "+names);
		System.out.println("Original list : "+e1.getNames());
	}

}
