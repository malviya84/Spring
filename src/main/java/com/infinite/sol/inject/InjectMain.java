package com.infinite.sol.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		InjectHelper setterInjectHelper = (InjectHelper) context.getBean("inject_helper_set");
		setterInjectHelper.print();
		
		InjectHelper constInjectHelper = (InjectHelper) context.getBean("inject_helper_const");
		constInjectHelper.print();
		
		System.out.println("Done!");
	}
}
