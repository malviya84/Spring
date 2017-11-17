package com.infinite.sol.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FullNameGenMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springbeans.xml"});
		
		// Normal way injection
		FullNameGenerator normalInjectBean = (FullNameGenerator) context.getBean("normalInjectBean");
		normalInjectBean.printFullName();
		
		// using attribute injection
		FullNameGenerator attributeInjectBean = (FullNameGenerator) context.getBean("attributeInjectBean");
		attributeInjectBean.printFullName();
				
		// p schema inject bean
		FullNameGenerator pInjectBean = (FullNameGenerator) context.getBean("pInjectBean");
		pInjectBean.printFullName();
		
		System.out.println("Done!");
	}
}
