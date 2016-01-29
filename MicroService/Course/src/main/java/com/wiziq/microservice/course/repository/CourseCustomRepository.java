package com.wiziq.microservice.course.repository;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.wiziq.microservice.course.model.Course;

public interface CourseCustomRepository {

	public Course findById(String id);

	public Course testMethod(Query query, Update update);

}
