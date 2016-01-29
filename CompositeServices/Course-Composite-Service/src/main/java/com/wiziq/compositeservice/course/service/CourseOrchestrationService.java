package com.wiziq.compositeservice.course.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wiziq.compositeservice.course.dto.CourseAttribute;
import com.wiziq.compositeservice.course.dto.CourseDto;
import com.wiziq.compositeservice.course.dto.CourseMetadata;
import com.wiziq.compositeservice.course.service.contracts.CourseMicroService;

@Component
public class CourseOrchestrationService {

	@Autowired
	private CourseMicroService courseMicroService;

	@HystrixCommand(fallbackMethod = "getCourseByIdFallback")
	public ResponseEntity<CourseDto> getCourseById(String id) {
		return courseMicroService.getCourseById(id);
	}

	@SuppressWarnings("unused")
	private ResponseEntity<?> getCourseByIdFallback(String id) {
		return new ResponseEntity<String>(HttpStatus.SERVICE_UNAVAILABLE);
	}

	@HystrixCommand(fallbackMethod = "createCourseFallback")
	public ResponseEntity<CourseDto> createCourse(CourseMetadata courseMetadata) {
		CourseDto courseDto = new CourseDto();
		BeanUtils.copyProperties(courseMetadata, courseDto);
		return courseMicroService.createCourse(courseDto);
	}

	@SuppressWarnings("unused")
	private ResponseEntity<?> createCourseFallback(CourseMetadata courseMetadata) {
		return new ResponseEntity<String>(HttpStatus.SERVICE_UNAVAILABLE);
	}

	@HystrixCommand(fallbackMethod = "updateCourseFallback")
	public ResponseEntity<CourseDto> updateCourse(String id, CourseAttribute courseAttributes) {
		CourseDto courseDto = new CourseDto();
		BeanUtils.copyProperties(courseAttributes, courseDto);
		// return new
		// ResponseEntity<CourseDto>(courseDto,HttpStatus.ALREADY_REPORTED);
		System.out.println(id);
		return courseMicroService.updateCourse(id, courseDto);
	}

	@SuppressWarnings("unused")
	private ResponseEntity<?> updateCourseFallback(String id, CourseAttribute courseAttributes) {
		return new ResponseEntity<CourseDto>(HttpStatus.SERVICE_UNAVAILABLE);
	}

}
