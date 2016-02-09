package com.wiziq.service.course.controller;

import com.wiziq.service.course.model.Course;
import com.wiziq.service.course.service.CourseService;
import com.wiziq.service.course.viewmodel.CourseAttribute;
import com.wiziq.service.course.viewmodel.CourseMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dinkarthakur on 30/12/15.
 */
@RestController
@RequestMapping(value = "/service")
public class CoursesController {

	@Autowired
	private CourseService courseService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getCourse(@PathVariable(value = "id") String id) {
		Course course = courseService.getCourse(id);
		return ResponseEntity.ok(course);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Course> saveCourseMatadata(@Validated @RequestBody CourseMetadata courseMetadata) {
		Course course = courseService.saveCourse(courseMetadata);
		return new ResponseEntity<Course>(course, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
	public ResponseEntity<Course> updateCourse(@PathVariable(value = "id") String id,
			@Validated @RequestBody CourseAttribute courseAttributeData) {
		Course course = courseService.updateCourseAttributes(id, courseAttributeData);
		return ResponseEntity.ok(course);
	}
}