package com.leaning.spring.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleAOP {

	public static void main(String[] args) {
ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
Alien s=context.getBean(Alien.class);
s.show();
	}

}
