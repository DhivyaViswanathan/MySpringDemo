package com.leaning.spring.SpringAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	public void cpu() {
		System.out.println("First CPU");
	}

}
