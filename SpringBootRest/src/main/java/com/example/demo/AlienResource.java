package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	
	@RequestMapping("/aliensRest")
	public List<Alien> getAlien(){
		List<Alien> list=new ArrayList<>();
		Alien a=new Alien();
		a.setId(101);
		a.setName("chikku");
		a.setPoints("100");
		Alien a1=new Alien();
		a1.setId(102);
		a1.setName("divs");
		a1.setPoints("110");
		list.add(a);
		list.add(a1);
		return list;
		
	}

}
