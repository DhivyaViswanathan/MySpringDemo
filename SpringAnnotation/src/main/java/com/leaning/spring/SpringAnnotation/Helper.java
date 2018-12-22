package com.leaning.spring.SpringAnnotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class Helper {

	@Before("execution(public void show())")
	public void log() {
		System.out.println("System logged");
	}
}
