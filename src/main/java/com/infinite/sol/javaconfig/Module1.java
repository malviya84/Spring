package com.infinite.sol.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Module1 {

	@Bean(name="module1Bean")
	public Module1Bean getModule1Bean(){
		return new Module1Bean();
	}
}
