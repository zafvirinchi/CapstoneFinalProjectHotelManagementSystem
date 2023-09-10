package com.tcs.auth.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.auth.model.ApiResponse;
import com.tcs.auth.model.LoginDetails;
import com.tcs.auth.model.User;

public interface AuthService {

	public ResponseEntity<ApiResponse<User>> signUp(@RequestBody User user);

	public ResponseEntity<ApiResponse<String>> login(LoginDetails loginDetails);

	public Boolean validateToken(String token);
}
