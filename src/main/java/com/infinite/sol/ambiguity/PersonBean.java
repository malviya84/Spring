package com.infinite.sol.ambiguity;

public class PersonBean {

	private String name;
	private int age;
	private String address;
	
	public PersonBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public PersonBean(int age, String name) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public PersonBean(String name, String address, int age) {
		super();
		//System.out.println("name-address-age invoked");
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public PersonBean(String name, int age, String address) {
		super();
		//System.out.println("name-age-address invoked");
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	

	@Override
	public String toString() {
		return "PersonBean [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
