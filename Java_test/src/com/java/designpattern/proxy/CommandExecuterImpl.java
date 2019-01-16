package com.java.designpattern.proxy;

public class CommandExecuterImpl implements CommandExecuter {
	
	@Override
	public void executeCommand(String command) {
		System.out.println("executing command : "+command);
	}

}
