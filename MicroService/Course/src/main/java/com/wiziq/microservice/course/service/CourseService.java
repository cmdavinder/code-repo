package com.wiziq.microservice.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiziq.microservice.course.model.Course;
import com.wiziq.microservice.course.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepo;
	
	public List <Course> getCourseByTitle(String title){
		return courseRepo.findByTitle(title);
	}
	
	public Course createCourseMetadata(Course courseMetaData){
		return courseRepo.save(courseMetaData);
	}
	
}
