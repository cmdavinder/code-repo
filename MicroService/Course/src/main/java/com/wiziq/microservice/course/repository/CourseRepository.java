package com.wiziq.microservice.course.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wiziq.microservice.course.model.Course;

public interface CourseRepository extends MongoRepository<Course, String>  {
	
	public List<Course> findByTitle(String title);

}
