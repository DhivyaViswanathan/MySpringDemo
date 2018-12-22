package com.leaning.spring.SampleSpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	private String Brand;

	public String getBrand() {
		return Brand;
	}

//	public Tyre(String brand) {
//		super();
//		Brand = brand;
//	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	@Override
	public String toString() {
		return "Its working";
	}
	

}
