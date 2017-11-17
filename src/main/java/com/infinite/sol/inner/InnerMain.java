package com.infinite.sol.inner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		ApplicationBean bean = (ApplicationBean) context.getBean("applicationBean");
		
		System.out.println(bean);
		
		System.out.println("Done!");
	}
}
