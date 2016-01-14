package com.wiziq.compositeservice.coursecompositeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dinkarthakur on 30/12/15.
 */
@RestController
@RequestMapping(value = "/create")
public class CourseController {

	@Autowired
	public Configuration con;
	

	@RequestMapping(value = "/hello")
	public String Create() {

		return "value is =" + con.getComponent();
	}
}

@Component
@ConfigurationProperties(prefix="info")
class Configuration {
	
	private String component;

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	
}
