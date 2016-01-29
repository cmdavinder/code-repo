package com.wiziq.microservice.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wiziq.microservice.course.model.Course;

public interface CourseRepository extends MongoRepository<Course, String>, CourseCustomRepository  {
	
}
