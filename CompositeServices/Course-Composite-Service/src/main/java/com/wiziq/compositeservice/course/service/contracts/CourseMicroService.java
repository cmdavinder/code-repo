package com.wiziq.compositeservice.course.service.contracts;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wiziq.compositeservice.course.dto.CourseMetadataDTO;

@FeignClient("${wiziq.microservice.course.serviceId}")
public interface CourseMicroService {

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	String Test();

	@RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
	String addCourseMetadata(CourseMetadataDTO courseMetadataDTO);
}
