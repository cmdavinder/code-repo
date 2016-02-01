package com.wiziq.compositeservice.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wiziq.compositeservice.course.dto.CourseDto;
import com.wiziq.compositeservice.course.service.CourseMicroServiceImpl;
import com.wiziq.compositeservice.course.viewmodel.CourseAttribute;
import com.wiziq.compositeservice.course.viewmodel.CourseMetadata;

/**
 * Created by dinkarthakur on 30/12/15.
 */
@RestController
@RequestMapping(value = "/")
public class CoursesController {

	@Autowired
	private CourseMicroServiceImpl courseOrchestrationService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<CourseDto> getCourse(@PathVariable(value = "id") String id) {
		return courseOrchestrationService.getCourseById(id);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<CourseDto> saveCourseMatadata(@Validated @RequestBody CourseMetadata courseMetadata) {
		return courseOrchestrationService.createCourse(courseMetadata);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<CourseDto> updateCourse(@PathVariable(value = "id") String id,
			@Validated @RequestBody CourseAttribute courseAttributeData) {
		return courseOrchestrationService.updateCourse(id, courseAttributeData);
	}
}
