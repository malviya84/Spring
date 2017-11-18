package com.infinite.sol.inheritance;

public class EmployeeBean {

	private String name;
	private int age;
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "EmployeeBean [name=" + name + ", age=" + age + ", country=" + country + "]";
	}

}
