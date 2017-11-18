package com.infinite.sol.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		ScopeBean singletonBean = (ScopeBean) context.getBean("singletonBean");
		ScopeBean prototypeBean = (ScopeBean) context.getBean("prototypeBean");
		
		System.out.println(singletonBean);
		System.out.println(prototypeBean);
		
		singletonBean.setMessage("Singleton Bean updated");
		prototypeBean.setMessage("Prototype Bean updated");
		
		ScopeBean singletonBean1 = (ScopeBean) context.getBean("singletonBean");
		ScopeBean prototypeBean1 = (ScopeBean) context.getBean("prototypeBean");
		System.out.println(prototypeBean);
		System.out.println(singletonBean1);
		System.out.println(prototypeBean1);
		
		System.out.println("Done!");
	}
}
