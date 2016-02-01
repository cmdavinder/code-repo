package com.wiziq.compositeservice.course.viewmodel;

import java.math.BigDecimal;
import java.util.Currency;

import com.wiziq.compositeservice.course.enums.CourseAccessibilty;
import com.wiziq.compositeservice.course.helpers.EnumValidator;

public class CourseAttribute {
	
	private BigDecimal price;
	private Currency currency;
	private Float discount;
	private Integer duration;
	@EnumValidator(enumClazz=CourseAccessibilty.class,message="Please Enter valid value")
	private CourseAccessibilty courseType;

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the currency
	 */
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	/**
	 * @return the discount
	 */
	public Float getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
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
	 * @param duration the duration to set
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	/**
	 * @return the courseType
	 */
	public CourseAccessibilty getCourseType() {
		return courseType;
	}

	/**
	 * @param courseType the courseType to set
	 */
	public void setCourseType(CourseAccessibilty courseType) {
		this.courseType = courseType;
	}
	
	
}
