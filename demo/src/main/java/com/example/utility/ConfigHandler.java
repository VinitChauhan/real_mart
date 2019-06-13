package com.example.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ConfigHandler {
	
	@Autowired
	private Environment env;
	
	public String getPropertyValue(String key) {
		return env.getProperty(key);
	}

}
