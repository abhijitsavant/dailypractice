package com.java.designpattern.builder;

public class Computer {
	String hdd;
	boolean isGraphicEnabled;
	
	
	private Computer(ComputerBuilder builder) {
		super();
		this.hdd = builder.hdd;
		this.isGraphicEnabled = builder.isGraphicEnabled;
	}
	
	

	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", isGraphicEnabled=" + isGraphicEnabled + "]";
	}



	static class ComputerBuilder{
		String hdd;
		boolean isGraphicEnabled;
		
		public ComputerBuilder(String hdd) {
			super();
			this.hdd = hdd;
		}

		public ComputerBuilder setGraphicEnabled(boolean isGraphicEnabled) {
			this.isGraphicEnabled = isGraphicEnabled;
			return this;
		}
		
		public  Computer build() {
			return new Computer(this);
		}
		
	}
}
