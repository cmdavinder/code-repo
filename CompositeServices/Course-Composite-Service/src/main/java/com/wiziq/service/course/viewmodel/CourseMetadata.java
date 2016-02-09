package com.wiziq.service.course.viewmodel;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class CourseMetadata {

	@NotBlank(message="error.coursemetadata.title.notempty" )
	private String title;
	@Length(min=0, max=1000)
	private String description;
	private String preRequisites;
	private String targetAudience;
	private String outcome;
	private String disclaimer;
	private String owner;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the preRequisites
	 */
	public String getPreRequisites() {
		return preRequisites;
	}

	/**
	 * @param preRequisites the preRequisites to set
	 */
	public void setPreRequisites(String preRequisites) {
		this.preRequisites = preRequisites;
	}

	/**
	 * @return the targetAudience
	 */
	public String getTargetAudience() {
		return targetAudience;
	}

	/**
	 * @param targetAudience the targetAudience to set
	 */
	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	/**
	 * @return the outcome
	 */
	public String getOutcome() {
		return outcome;
	}

	/**
	 * @param outcome the outcome to set
	 */
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	/**
	 * @return the disclaimer
	 */
	public String getDisclaimer() {
		return disclaimer;
	}

	/**
	 * @param disclaimer the disclaimer to set
	 */
	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
}
