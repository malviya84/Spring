package com.infinite.sol.inject;

public class InjectHelper {

	private InjectBean bean;
	
	public InjectHelper() {
	}
	
	InjectHelper(InjectBean bean){
		this.bean = bean;
	}
	
	public InjectBean getBean() {
		return bean;
	}

	public void setBean(InjectBean bean) {
		this.bean = bean;
	}

	public void print(){
		bean.print();
	}
}
