package com.wiziq.service.course.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.wiziq.service.course.model.Course;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

	@Autowired
	private MongoTemplate mongoTemplate;

	public Course updateCourse(String id, Course course) {
		DBObject courseObj = (DBObject) mongoTemplate.getConverter().convertToMongoType(course);
		Update update = Update.fromDBObject(new BasicDBObject("$set", courseObj));
		Query query = new Query(Criteria.where("id").is(id));
		return mongoTemplate.findAndModify(query, update, FindAndModifyOptions.options().returnNew(true),
				Course.class);
	}

//	public Course updateCourse(String id, Course course) {
//		Update update = new Update();
//		update.set("$set", course);
//	    mongoTemplate.updateFirst(Query.query(Criteria.where("id").is(id)),update,Course.class );
//	    return (Course) mongoTemplate.find(Query.query(Criteria.where("id").is(id)), Course.class);
//	    
//	    
//	}

}
