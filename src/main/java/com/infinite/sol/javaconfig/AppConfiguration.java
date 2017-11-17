package com.infinite.sol.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.infinite.sol.hello.HelloSpring;

@Configuration
@Import({Module1.class, Module2.class})
public class AppConfiguration {

	@Bean(name="helloBean")
	public HelloSpring getHelloBean(){
		HelloSpring bean = new HelloSpring();
		bean.setName("HDM");
		return bean;
	}
}
