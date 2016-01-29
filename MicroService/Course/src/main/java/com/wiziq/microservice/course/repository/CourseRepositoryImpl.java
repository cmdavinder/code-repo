package com.wiziq.microservice.course.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.wiziq.microservice.course.model.Course;

public class CourseRepositoryImpl implements CourseCustomRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	public Course findById(String id) {
		Criteria c = Criteria.where("_id").is(id);
		return mongoTemplate.findOne(Query.query(c), Course.class);
	}

	public Course testMethod(Query query, Update update) {
		System.out.println(query);
		return mongoTemplate.findAndModify(query, update, Course.class);
	}

}
