package com.infinite.sol.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		CollectionBean collectionBean = (CollectionBean) context.getBean("collectionBean");
		
		System.out.println(collectionBean);
		
		System.out.println("Done!");
	}
}
