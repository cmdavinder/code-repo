package com.wiziq.service.course.model;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by dinkarthakur on 25/01/16.
 */
@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Course extends AuditorModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2768083473000912708L;

	private String title;
	private String description;
	private String preRequisites;
	private String targetAudience;
	private String outcome;
	private String disclaimer;
	private String owner;
	private BigDecimal price;
	private String currency;
	private Float discount;
	private Integer duration;
	private Integer courseType;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
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
	 * @param description
	 *            the description to set
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
	 * @param preRequisites
	 *            the preRequisites to set
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
	 * @param targetAudience
	 *            the targetAudience to set
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
	 * @param outcome
	 *            the outcome to set
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
	 * @param disclaimer
	 *            the disclaimer to set
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
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the discount
	 */
	public Float getDiscount() {
		return discount;
	}

	/**
	 * @param discount
	 *            the discount to set
	 */
	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	/**
	 * @return the duration
	 */
	public Integer getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	/**
	 * @return the courseType
	 */
	public Integer getCourseType() {
		return courseType;
	}

	/**
	 * @param courseType
	 *            the courseType to set
	 */
	public void setCourseType(Integer courseType) {
		this.courseType = courseType;
	}

}
