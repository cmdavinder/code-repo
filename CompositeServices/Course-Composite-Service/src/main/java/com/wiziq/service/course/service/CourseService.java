package com.wiziq.service.course.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiziq.service.course.model.Course;
import com.wiziq.service.course.repository.CourseRepository;
import com.wiziq.service.course.viewmodel.CourseAttribute;
import com.wiziq.service.course.viewmodel.CourseMetadata;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepo;

	public Course getCourse(String id) {
		return courseRepo.findOne(id);
	}

	public Course saveCourse(CourseMetadata courseMetadata) {
		Course course = new Course();
		BeanUtils.copyProperties(courseMetadata, course);
		return courseRepo.save(course);
	}

	public Course updateCourseAttributes(String id, CourseAttribute courseAttribute) {
		Course course = new Course();
		BeanUtils.copyProperties(courseAttribute, course);
		course.setId(id);
		return courseRepo.updateCourse(id, course);
	}

}
