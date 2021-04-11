package com.juan.formacion.cookbook.standardinput;

public class ConsoleRead {
	
	public static void consoleReadLine() {
		System.out.println("Console read.");
		String lineConsole = System.console().readLine("What's your name?");
		System.out.println("My name is "+ lineConsole);		
	}

}
