package com.java.designpattern.adapter;

public class Main {

	public static void main(String[] args) {
		testAdapter();
	}

	private static void testAdapter() {
		SocketAdapter sockAdapter = new SocketAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		//Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Class Adapter="+v3.getVolt());
		System.out.println("v12 volts using Class Adapter="+v12.getVolt());
		//System.out.println("v120 volts using Class Adapter="+v120.getVolt());
	}

	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch(i) {
			case 3 : 
				return sockAdapter.get3Volt();
			
			case 12 : 
				return sockAdapter.get12Volt();
			
		}
		return null;
	}

}
