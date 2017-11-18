package com.infinite.sol.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapFactoryBeanMain {

public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		CollectionBean bean = (CollectionBean) context.getBean("mapFactoryBean");
		CollectionBean bean1 = (CollectionBean) context.getBean("mapFactoryBean1");
		System.out.println(bean.getMap());
		System.out.println(bean1.getMap());
		System.out.println("Done!");
	}
}
