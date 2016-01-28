package com.wiziq.microservice.course.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.wiziq.microservice.course.model.Course;

public class CourseCustomRepositoryImpl implements CourseCustomeRepository {

	 @Autowired
	 private MongoTemplate mongoTemplate;
	
	 public List<Course> findByTitle(String title) {
		Criteria c = Criteria.where("title").is("dinkar");
		return mongoTemplate.find(Query.query(c), Course.class);
	}

}
