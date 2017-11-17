package com.infinite.sol.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infinite.sol.hello.HelloSpring;

public class AppConfigurationMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		ApplicationContext anotherContext = new ClassPathXmlApplicationContext("springbeans.xml");
		
		HelloSpring bean = (HelloSpring) context.getBean("helloBean");
		bean.sayHello();
		
		HelloSpring beanFromAnotherContext = (HelloSpring) anotherContext.getBean("helloBean");
		beanFromAnotherContext.sayHello();
		
		System.out.println("Done!");
	}
}
