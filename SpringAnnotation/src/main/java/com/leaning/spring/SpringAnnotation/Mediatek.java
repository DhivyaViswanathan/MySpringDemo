package com.leaning.spring.SpringAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Mediatek implements MobileProcessor {

	public void cpu() {

		System.out.println("Second CPU");
	}

}
