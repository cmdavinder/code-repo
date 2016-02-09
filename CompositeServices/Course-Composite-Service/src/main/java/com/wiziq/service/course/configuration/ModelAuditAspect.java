package com.wiziq.service.course.configuration;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ModelAuditAspect {

	@Before(value = "(execution(public * org.springframework.data.mongodb.core.MongoOperations.update*(..)) ||"
			+ "execution(public * org.springframework.data.mongodb.core.MongoOperations.findAndModify(..)))"
			+ " && args(query,update,.. )")
	public void setAuditFields(Query query, Update update) {
		if (update != null) {
			Instant utcInstantTime = ZonedDateTime.now(ZoneOffset.UTC).toInstant();
			update.inc("version", 1);
			update.set("lastModifiedDate",Date.from(utcInstantTime));
			// .set(“lastModifiedBy”, auditorAware.getCurrentAuditor())
		}
	}
}
