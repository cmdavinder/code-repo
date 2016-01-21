package com.wiziq.compositeservice.course.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class CourseMetadataDTO {
	
	  @NotNull(message = "error.title.notnull")
	  @Size(min = 1, max = 30, message = "error.title.size")
	  private String title;
	  
	  @Size(max = 100, message = "error.description.size")
	  private String description;
	  
}
