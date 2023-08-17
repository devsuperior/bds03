package com.devsuperior.bds03.controllers.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {
	

	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ValidationError> validation(MethodArgumentNotValidException entity, HttpServletRequest request){
			ValidationError standard = new ValidationError();
			HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
			standard.setTimestamp(Instant.now());
			standard.setStatus(status.value());
			standard.setError("Validation exception");
			standard.setMessage(entity.getMessage());
			standard.setPath(request.getRequestURI());
			for(FieldError f : entity.getBindingResult().getFieldErrors() ) {
				standard.addError(f.getField(), f.getDefaultMessage());
			}
			
			
			
			return ResponseEntity.status(status).body(standard);
	}
}
