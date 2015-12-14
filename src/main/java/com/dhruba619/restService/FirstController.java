package com.dhruba619.restService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/applicationName")
public class FirstController{

	@RequestMapping("/service/{name}")
	public String sayHello(@PathVariable String name){
		return "Hello "+name; 
	}
} 