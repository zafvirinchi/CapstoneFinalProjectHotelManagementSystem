package com.tcs.guest.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) {

		return new ResponseEntity<>(new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false)),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(AuthorizationException.class)
	public ResponseEntity<Object> handleHotelNotFoundException(Exception ex, WebRequest request) {

		return new ResponseEntity<>(new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false)),
				HttpStatus.UNAUTHORIZED);
	}
}
