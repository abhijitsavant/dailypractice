package com.java.designpattern.proxy;

public class CommandExecutorProxy {
	private CommandExecuterImpl commandExecuter;

	public CommandExecutorProxy(String user,String password,String command) {
		super();
		this.commandExecuter = new CommandExecuterImpl();
		if(user.equals("abhi")&&password.equals("123")) {
			commandExecuter.executeCommand(command);
		}else {
			System.out.println("no access");
		}
		
	}
	
	
}
