package com.wiziq.compositeservice.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.governator.annotations.binding.Request;
import com.wiziq.compositeservice.course.dto.Course;
import com.wiziq.compositeservice.course.dto.CourseAttribute;
import com.wiziq.compositeservice.course.dto.CourseMetadata;
import com.wiziq.compositeservice.course.service.CourseOrchestrationService;

/**
 * Created by dinkarthakur on 30/12/15.
 */
@RestController
@RequestMapping(value = "/")
public class CoursesController {

	@Autowired
	public CourseOrchestrationService courseOrchestrationService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Course> getCourse(@PathVariable(value="id") String id) {
		return courseOrchestrationService.getCourseById(id);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<?> saveCourseMatadata(@Validated @RequestBody CourseMetadata courseMetadata) {
		return courseOrchestrationService.createCourse(courseMetadata);
	}
	
	@RequestMapping(value="/", method= RequestMethod.PATCH)
	public ResponseEntity<?> updateCourse(@RequestBody CourseAttribute courseAttributeData){
		return courseOrchestrationService.updateCourse(courseAttributeData);
	}
}
