package com.wiziq.microservice.course.repository;

import java.util.List;

import com.wiziq.microservice.course.model.Course;

public interface CourseCustomeRepository {

	public List<Course> findByTitle(String title);
	
}
