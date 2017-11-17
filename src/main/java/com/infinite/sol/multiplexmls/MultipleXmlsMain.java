package com.infinite.sol.multiplexmls;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultipleXmlsMain {

	public static void main(String[] args) {
		
		// One way - to load all files while creating context 
		ApplicationContext loadMultipleXmls = new ClassPathXmlApplicationContext(new String[]{"common/spring_common.xml", "module1/spring_module1.xml"});
		
		MultipleXmlsBean moduleBean = (MultipleXmlsBean) loadMultipleXmls.getBean("moduleBean");
		MultipleXmlsBean commonBean = (MultipleXmlsBean) loadMultipleXmls.getBean("commonBean");
		
		moduleBean.printMsg();
		commonBean.printMsg();
		
		
		// Second way - to load single file and import all sub xmls in it
		ApplicationContext loadSingleXml = new ClassPathXmlApplicationContext("springbeans.xml");
		MultipleXmlsBean moduleBeanSingle = (MultipleXmlsBean) loadSingleXml.getBean("moduleBeanSingle");
		MultipleXmlsBean commonBeanSingle = (MultipleXmlsBean) loadSingleXml.getBean("commonBeanSingle");
		
		moduleBeanSingle.printMsg();
		commonBeanSingle.printMsg();
		
		System.out.println("Done!");
	}
}
