package com.wiziq.microservice.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.wiziq.microservice.course.model.Course;
import com.wiziq.microservice.course.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepo;

	public Course getCourseById(String id) {
		return courseRepo.findOne(id);
	}

	public Course createCourse(Course course) {
		return courseRepo.save(course);
	}

	public Course updateCourse(String id, Course courseData) {
		Criteria c = Criteria.where("_id").is(id);
		Query qry = new Query(c);
		Update update = new Update();
		update.set("duration", courseData.getDuration());
		return courseRepo.testMethod(qry, update);
	}

}
