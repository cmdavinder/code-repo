package com.wiziq.compositeservice.course.service.contracts;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wiziq.compositeservice.course.dto.Course;
import com.wiziq.compositeservice.course.dto.CourseAttribute;
import com.wiziq.compositeservice.course.dto.CourseMetadata;

@FeignClient("${wiziq.microservice.course.serviceId}")
public interface CourseMicroService {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<Course> getCourseById(@PathVariable(value ="id") String id);

	@RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
	ResponseEntity<Course> createCourse(CourseMetadata courseMetadata);

	@RequestMapping(value="/", method = RequestMethod.PATCH)
	ResponseEntity<Course> updateCourse(CourseAttribute courseAttributes);
}
