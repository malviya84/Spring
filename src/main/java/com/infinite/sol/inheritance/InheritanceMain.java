package com.infinite.sol.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		EmployeeBean employee1 = (EmployeeBean) context.getBean("inheritanceBean");
		EmployeeBean employee2 = (EmployeeBean) context.getBean("inheritanceBean1");
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println("Done!");
	}
}
