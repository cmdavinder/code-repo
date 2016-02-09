package com.wiziq.service.course.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.wiziq.service.course.model.Course;

@Repository(value="course")
@RepositoryRestResource(collectionResourceRel = "course", path = "repo")
public interface CourseRepository extends MongoRepository<Course, String>, CourseRepositoryCustom {
	
	Course findById(@Param("id") String id);
	
	List<Course> findByTitle(@Param("title") String title);
	
}
