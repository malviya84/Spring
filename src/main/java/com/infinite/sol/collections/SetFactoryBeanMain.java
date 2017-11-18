package com.infinite.sol.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetFactoryBeanMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		CollectionBean bean = (CollectionBean) context.getBean("setFactoryBean");
		CollectionBean bean1 = (CollectionBean) context.getBean("setFactoryBean1");
		System.out.println(bean.getSet());
		System.out.println(bean1.getSet());
		System.out.println("Done!");
	}
}
