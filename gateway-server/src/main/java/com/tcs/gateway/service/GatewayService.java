package com.tcs.gateway.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.gateway.model.ApiResponse;
import com.tcs.gateway.model.LoginDetails;
import com.tcs.gateway.model.User;

public interface GatewayService {
	public ResponseEntity<ApiResponse<User>> signUp(@RequestBody User user);

	public ResponseEntity<ApiResponse<String>> login(LoginDetails loginDetails);

}
