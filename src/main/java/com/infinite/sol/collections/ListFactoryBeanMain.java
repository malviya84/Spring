package com.infinite.sol.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListFactoryBeanMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		CollectionBean bean = (CollectionBean) context.getBean("listFactoryBean");
		CollectionBean bean1 = (CollectionBean) context.getBean("listFactoryBean1");
		System.out.println(bean.getList());
		System.out.println(bean1.getList());
		System.out.println("Done!");
	}
}
