package com.pradeep.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.pradeep.springdemo.mvc.validation.CourseCode;
import com.sun.istack.internal.NotNull;

public class Customer {
	
	public String firstName;
	
	@NotEmpty(message="is required")
	@Size(min=5, message="is required")
	public String lastName;
	
	@Min(value = 0, message="must be greater than or equal to zero")
	@Max(value = 10, message="must be less than or equal to 10")
	@javax.validation.constraints.NotNull(message = "is required")
	private Integer freePasses;
	
	@Pattern(regexp = "^[0-9]{6}", message="only 6 digits")
	private String postalCode;
	
	@CourseCode(value = {"SPP", "LUV"}, message = "must start with SPP or LUV")
	private String courseCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

}
