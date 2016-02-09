package com.wiziq.service.course.configuration;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

import com.wiziq.service.course.model.AuditorModel;

@Configuration
public class ModelAuditingEventListner implements ApplicationListener<BeforeConvertEvent<Object>> {
	
	@Override
	public void onApplicationEvent(BeforeConvertEvent<Object> event) {
		Object obj = event.getSource();
		Instant utcInstantTime = ZonedDateTime.now(ZoneOffset.UTC).toInstant();
		if (AuditorModel.class.isAssignableFrom(obj.getClass())) {
			AuditorModel entity = (AuditorModel) obj;
			if (entity.isNew()) {
				entity.setCreatedDate(Date.from(utcInstantTime));
				entity.setLastModifiedDate(Date.from(utcInstantTime));
			} else {
				entity.setLastModifiedDate(Date.from(utcInstantTime));
			}
		}
	}
}
