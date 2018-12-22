package com.leaning.spring.SampleSpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements vehicle {

	public void drive() {
		System.out.println("this is bike");
	}
}
