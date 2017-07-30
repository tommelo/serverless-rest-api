package com.itgorillaz.api.handler;

import javax.validation.Valid;

import com.amazonaws.services.lambda.runtime.Context;
import com.itgorillaz.api.request.PostUserRequest;
import com.itgorillaz.api.response.PostUserResponse;

import br.com.tdsis.lambda.forest.http.exception.HttpException;
import br.com.tdsis.lambda.forest.http.handler.AbstractRequestHandler;

public class PostUserHandler extends AbstractRequestHandler<PostUserRequest, PostUserResponse> {
		
	@Override
	public void before(Context context) throws HttpException {
		addResponseHeader("Access-Control-Allow-Origin", "*");		
	}

	@Override
	public PostUserResponse execute(@Valid PostUserRequest input, Context context) throws HttpException {
		String message = String.format("Hello %1s %2s", input.getFirstName(), input.getLastName());
		return new PostUserResponse(message);
	}

}
