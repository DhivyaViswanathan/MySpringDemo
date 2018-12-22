package com.leaning.spring.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	@Autowired
	@Qualifier("mediatek")
	MobileProcessor processor;
	
	public MobileProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(MobileProcessor processor) {
		this.processor = processor;
	}

	void config() {
		System.out.println("Samsung class");
		processor.cpu();
	}
}
