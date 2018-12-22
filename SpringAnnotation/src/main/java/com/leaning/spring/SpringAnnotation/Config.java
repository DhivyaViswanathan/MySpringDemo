package com.leaning.spring.SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages="com.leaning.Spring.SpringAnnotation")
public class Config {
	
//@Bean
//	public Samsung getValue() {
//		return new Samsung();
//		
//	}
//@Bean
//public MobileProcessor getCpu() {
//	return new Snapdragon();
//}
}
