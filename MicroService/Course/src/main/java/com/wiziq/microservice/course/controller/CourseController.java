package com.wiziq.microservice.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Course> getCourseById(@PathVariable(value = "id") String id) {
		return new ResponseEntity<Course>(courseService.getCourseById(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Course> CourseMetadata(@RequestBody Course courseDto) {
		courseService.createCourse(courseDto);
		return new ResponseEntity<Course>(courseDto, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Course> updateCourse(@PathVariable(value = "id") String id, @RequestBody Course courseDto) {
		Course c = courseService.updateCourse(id,courseDto);
		return new ResponseEntity<Course>(c, HttpStatus.OK);
	}

}
