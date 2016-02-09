package com.wiziq.service.course.enums;

public enum CourseAccessibilty {
	PUBLIC(0), PRIVATE(1);
	private final int value;

	private CourseAccessibilty(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}