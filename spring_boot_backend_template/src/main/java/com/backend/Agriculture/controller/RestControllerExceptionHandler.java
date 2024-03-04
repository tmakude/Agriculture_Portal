package com.backend.Agriculture.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.backend.Agriculture.models.Response;


@ControllerAdvice
public class RestControllerExceptionHandler {
	
	@ExceptionHandler({RuntimeException.class})
	public ResponseEntity<?> handleRuntimeException(RuntimeException ex) {
		return Response.status(HttpStatus.NOT_FOUND);
	}
	
}
