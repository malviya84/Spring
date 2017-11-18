
package com.infinite.sol.prepostactions;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrePostActionsMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		//PrePostActionsBean bean = (PrePostActionsBean) context.getBean("prePostActionsBean");
		PrePostActionsBean bean1 = (PrePostActionsBean) context.getBean("prePostActionBeanWithCustomMethods");
		context.registerShutdownHook();
		System.out.println("Done!");
	}
}
