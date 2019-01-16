package com.java.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Object implements Cloneable{
	private List<String> names;
	
	public Employee() {
		names = new ArrayList<>();
	}
	
	private Employee(List<String> names) {
		super();
		this.names = names;
	}

	public List<String> getNames() {
		return names;
	}
	
	public void loadEmployeeNames() {
		names.add("A");
		names.add("B");
		names.add("C");
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		List<String> clonnedNames = new ArrayList<>();
		names.forEach((e)->{
			clonnedNames.add(e);
			});
		return new Employee(clonnedNames);
		
	}
}
