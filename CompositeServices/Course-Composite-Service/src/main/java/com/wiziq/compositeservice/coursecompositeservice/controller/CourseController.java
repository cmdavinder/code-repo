package com.wiziq.compositeservice.coursecompositeservice.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wiziq.compositeservice.coursecompositeservice.dto.CourseMetadataDTO;

/**
 * Created by dinkarthakur on 30/12/15.
 */
@RestController
@RequestMapping(value = "/")
public class CourseController {

	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String Hello(@Validated @RequestBody CourseMetadataDTO courseMetadataDTO){
		return "asdfasdf";
	}
	
}
