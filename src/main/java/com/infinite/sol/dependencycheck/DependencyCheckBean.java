package com.infinite.sol.dependencycheck;

public class DependencyCheckBean {

	private int property1;
	
	private Object property2;
	
	private String property3;

	public int getProperty1() {
		return property1;
	}

	public void setProperty1(int property1) {
		this.property1 = property1;
	}

	public Object getProperty2() {
		return property2;
	}

	public void setProperty2(Object property2) {
		this.property2 = property2;
	}

	public String getProperty3() {
		return property3;
	}

	public void setProperty3(String property3) {
		this.property3 = property3;
	}

	@Override
	public String toString() {
		return "DependencyCheckBean [property1=" + property1 + ", property2=" + property2 + ", property3=" + property3
				+ "]";
	}
}
