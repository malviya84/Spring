package com.infinite.sol.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ModuleImportMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		Module1Bean bean1 =  (Module1Bean) context.getBean("module1Bean");
		bean1.print();
		
		Module2Bean bean2 = (Module2Bean) context.getBean("module2Bean");
		bean2.print();
		
		System.out.println("Done!");
	}
}
