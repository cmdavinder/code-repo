package com.wiziq.compositeservice.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wiziq.compositeservice.course.dto.CourseMetadataDTO;
import com.wiziq.compositeservice.course.service.contracts.CourseMicroService;

@Component
public class CourseOrchestrationService {

	@Autowired
	private CourseMicroService courseMicroService;
	
	@HystrixCommand(fallbackMethod = "testFallback")
    public String Test() {      
        return courseMicroService.Test();
    }

    @SuppressWarnings("unused")
	private String testFallback() {    
        return "jijijijijiji";
    }
    
    @HystrixCommand(fallbackMethod = "addCourseMetadatafallback")
    public String addCourseMetadata(CourseMetadataDTO courseMetadataDTO){
    	return courseMicroService.addCourseMetadata(courseMetadataDTO);
    	
    }  
    @SuppressWarnings("unused")
	private String addCourseMetadatafallback(CourseMetadataDTO courseMetadataDTO){
    	return "error";
    }
	
}
