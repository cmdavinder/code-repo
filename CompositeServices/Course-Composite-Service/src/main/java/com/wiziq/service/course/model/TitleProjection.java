package com.wiziq.service.course.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="TitleProjection", types={Course.class})
public interface TitleProjection {

	String getTitle();

}
