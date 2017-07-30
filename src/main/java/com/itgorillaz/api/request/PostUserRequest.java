package com.itgorillaz.api.request;

import javax.validation.constraints.Size;

public class PostUserRequest {

	@Size(min = 3, max = 45)
	private String firstName;

	@Size(min = 3, max = 45)
	private String lastName;

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

}
