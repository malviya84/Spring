package com.infinite.sol.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		PersonBean personBean = (PersonBean)context.getBean("personBean");
		PersonBean personBean1 = (PersonBean)context.getBean("personBean1");
		
		System.out.println(personBean);
		System.out.println(personBean1);
		
		System.out.println("Done!");
	}
}
