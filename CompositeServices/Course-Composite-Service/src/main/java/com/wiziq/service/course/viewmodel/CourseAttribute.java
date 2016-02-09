package com.wiziq.service.course.viewmodel;

import java.math.BigDecimal;

public class CourseAttribute {

	private BigDecimal price;
	private String currency;
	private Float discount;
	private Integer duration;
	//@EnumValidator(enumClazz = CourseAccessibilty.class,message="This error is coming from the enum class")
	private Integer courseType;

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
