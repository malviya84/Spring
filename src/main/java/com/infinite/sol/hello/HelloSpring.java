package com.infinite.sol.hello;

public class HelloSpring {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("Welcome to Springframework - " + this.name);
	}
}
