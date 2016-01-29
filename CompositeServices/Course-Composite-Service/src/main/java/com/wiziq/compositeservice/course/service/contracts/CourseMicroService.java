package com.wiziq.compositeservice.course.service.contracts;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wiziq.compositeservice.course.dto.CourseDto;

@FeignClient("${wiziq.microservice.course.serviceId}")
public interface CourseMicroService {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<CourseDto> getCourseById(@PathVariable(value = "id") String id);

	@RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
	ResponseEntity<CourseDto> createCourse(CourseDto courseData);

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json")
	ResponseEntity<CourseDto> updateCourse(@PathVariable(value = "id") String id, CourseDto courseData);

}
