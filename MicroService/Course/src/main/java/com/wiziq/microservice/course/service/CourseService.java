package com.wiziq.microservice.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiziq.microservice.course.model.Course;
import com.wiziq.microservice.course.repository.CourseRepository;

@Service
public class CourseService {

	
	@Autowired
	private CourseRepository courseRepo;
	
	public Course getCourseById(String id){
		return courseRepo.findOne(id);
	}
	
	public Course createCourse(Course course){
		return courseRepo.save(course);
	}
	
	public Course updateCourse(Course courseData){
		return null;//return courseRepo.findByTitle(courseData.getTitle());
	}

	
}
