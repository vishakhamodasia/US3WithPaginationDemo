package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BatteryController {
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String goHome(){
		return "index";
	}
	
	@RequestMapping(path="/one", method=RequestMethod.GET)
	public String goToOne(){
		return "one";
	}

	@RequestMapping(path="/two", method=RequestMethod.GET)
	public String goToTwo(){
		return "two";
	}
	
	@RequestMapping(path="/three", method=RequestMethod.GET)
	public String goToThree(){
		return "three";
	}
	
}
