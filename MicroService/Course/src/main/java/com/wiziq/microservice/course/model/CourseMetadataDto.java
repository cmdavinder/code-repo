package com.wiziq.microservice.course.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class CourseMetadataDto {

	@NotBlank(message = "error.coursemetadata.title.notempty")
	@Size(max = 50, message = "error.coursemetadata.title.size")
	private String title;

	@Size(max = 100, message = "error.coursemetadata.description.size")
	private String description;

	@Size(max = 1000, message = "error.coursemetadata.prerequisites.size")
	private String preRequisites;

	@Size(max = 1000, message = "error.coursemetadata.targetaudience.size")
	private String targetAudience;

	@Size(max = 1000, message = "error.coursemetadata.outcome.size")
	private String outcome;

	@Size(max = 1000, message = "error.coursemetadata.disclaimer.size")
	private String disclaimer;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPreRequisites() {
		return preRequisites;
	}

	public void setPreRequisites(String preRequisites) {
		this.preRequisites = preRequisites;
	}

	public String getTargetAudience() {
		return targetAudience;
	}

	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public String getDisclaimer() {
		return disclaimer;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

}
