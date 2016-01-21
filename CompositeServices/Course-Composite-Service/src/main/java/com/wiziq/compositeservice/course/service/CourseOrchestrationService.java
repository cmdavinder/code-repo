package com.wiziq.compositeservice.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wiziq.compositeservice.course.service.contracts.CourseMicroService;

@Component
public class CourseOrchestrationService {

	@Autowired
	private CourseMicroService courseMicroService;
	
	@HystrixCommand(fallbackMethod = "fallback")
    public String Test() {      
        return courseMicroService.getMessage("asdf");
    }

    private String fallback() {    
        return "jijijijijiji";
    }
	
}
