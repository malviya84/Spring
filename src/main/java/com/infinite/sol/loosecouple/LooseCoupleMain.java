package com.infinite.sol.loosecouple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCoupleMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springbeans.xml"});
		LoosecoupleHelper vehicleHelper = (LoosecoupleHelper) context.getBean("loosecouple_helper");
		vehicleHelper.printVehicleDetails();
		System.out.println("Done!");
	}
}
