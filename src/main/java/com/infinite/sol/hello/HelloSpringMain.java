package com.infinite.sol.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		HelloSpring bean =  (HelloSpring) context.getBean("helloBean");
		bean.sayHello();
		
		System.out.println("Done!");
	}
}
