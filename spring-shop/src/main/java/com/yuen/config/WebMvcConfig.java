package com.yuen.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
 
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// Enable static/upload folder
		String[] CLASSPATH_RESOURCE_LOCATIONS = {"classpath:/static/upload/"};
		registry.addResourceHandler("/static/upload/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
	}
	
}
