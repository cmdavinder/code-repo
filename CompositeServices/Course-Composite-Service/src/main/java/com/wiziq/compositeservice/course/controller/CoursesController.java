package com.wiziq.compositeservice.course.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wiziq.compositeservice.course.dto.CourseMetadataDTO;
import com.wiziq.compositeservice.course.service.CourseOrchestrationService;

/**
 * Created by dinkarthakur on 30/12/15.
 */
@RestController
@RequestMapping(value = "/")
public class CoursesController {

	@Autowired
	public CourseOrchestrationService courseOrchestrationService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String Hello() {
		return courseOrchestrationService.Test();
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String addCourseMetadata(@Validated @RequestBody CourseMetadataDTO courseMetadataDTO) {
		return courseOrchestrationService.addCourseMetadata(courseMetadataDTO);
	}
}
