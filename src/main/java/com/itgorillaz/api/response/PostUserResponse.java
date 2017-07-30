package com.itgorillaz.api.response;

public class PostUserResponse {

	private String message;

	public PostUserResponse(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
		
}
