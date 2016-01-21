package com.wiziq.microservice.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wiziq.microservice.course.model.Course;
import com.wiziq.microservice.course.service.CourseService;

@RestController
@RequestMapping(value = "/")
public class CourseController {

	@Autowired
	public CourseService courseService;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String Test() {
		courseService.getCourseByTitle("hello");
		return "adf";
	}
	
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String createCourseMetadata(@Validated @RequestBody Course courseModel) {
		
		courseService.createCourseMetadata(courseModel);
		return "done";
	}

}
