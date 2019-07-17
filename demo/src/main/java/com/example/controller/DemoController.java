package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.utility.ConfigHandler;

@Controller
public class DemoController {
	
	@Autowired
	private ConfigHandler configHandler;
	
	@RequestMapping(method = RequestMethod.GET, value="/test")
	public @ResponseBody String testMethod() {
		
		return configHandler.getPropertyValue("test.prop");
	}

}
