package com.bshop.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<MyErrorDetails> customerExceptionHandler(CustomerException ce, WebRequest req) {
		MyErrorDetails err = new MyErrorDetails();
		err.setTimeStamp(LocalDate.now());
		err.setMessage(ce.getMessage());
		err.setDescription(req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);

	}

}
