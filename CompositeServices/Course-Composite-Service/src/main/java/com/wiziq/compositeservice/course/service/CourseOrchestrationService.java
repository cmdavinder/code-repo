package com.wiziq.compositeservice.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wiziq.compositeservice.course.dto.Course;
import com.wiziq.compositeservice.course.dto.CourseAttribute;
import com.wiziq.compositeservice.course.dto.CourseMetadata;
import com.wiziq.compositeservice.course.service.contracts.CourseMicroService;

@Component
public class CourseOrchestrationService {

	@Autowired
	private CourseMicroService courseMicroService;
	
	@HystrixCommand(fallbackMethod = "getCourseByIdFallback")
    public ResponseEntity<Course> getCourseById(String id) {  
        return courseMicroService.getCourseById(id);
    }

    @SuppressWarnings("unused")
	private ResponseEntity<?> getCourseByIdFallback(String id) {    
    	return new ResponseEntity<String>(HttpStatus.SERVICE_UNAVAILABLE);
    }
    
    @HystrixCommand(fallbackMethod = "createCourseFallback")
    public ResponseEntity<Course> createCourse(CourseMetadata courseMetadata){
    	return courseMicroService.createCourse(courseMetadata); 	
    }  
    
    @SuppressWarnings("unused")
	private ResponseEntity<?> createCourseFallback(CourseMetadata courseMetadata){
    	return new ResponseEntity<String>(HttpStatus.SERVICE_UNAVAILABLE);
    }
    
    @HystrixCommand(fallbackMethod = "updateCourseFallback")
    public ResponseEntity<Course> updateCourse(CourseAttribute courseAttributes){
    	return courseMicroService.updateCourse(courseAttributes); 	
    }
    
    @SuppressWarnings("unused")
	private ResponseEntity<?> updateCourseFallback(Course courseData){
    	return new ResponseEntity<String>(HttpStatus.SERVICE_UNAVAILABLE);
    }
	
}
