package com.tcs.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.auth.model.ApiResponse;
import com.tcs.auth.model.LoginDetails;
import com.tcs.auth.model.User;
import com.tcs.auth.service.AuthService;

@RestController
public class AuthControllerImpl implements AuthController {

	@Autowired
	private AuthService authService;

	@Override
	public ResponseEntity<ApiResponse<String>> login(LoginDetails loginDetails) {
		return authService.login(loginDetails);
	}

	@Override
	public Boolean validateToken(String token) {

		return authService.validateToken(token);
	}

	@Override
	public ResponseEntity<ApiResponse<User>> signUp(User user) {
		return authService.signUp(user);
	}

}
