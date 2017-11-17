package com.infinite.sol.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Module2 {

	@Bean(name="module2Bean")
	public Module2Bean getModule2Bean(){
		return new Module2Bean();
	}
}
