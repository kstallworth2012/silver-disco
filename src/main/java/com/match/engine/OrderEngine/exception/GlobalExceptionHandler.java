package com.match.engine.OrderEngine.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.support.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<Map<String,String>> handleValidationException(MethodArgumentNotValidException ex){
	  Map<String, String>errors = new HashMap<>();
	  
	  ex.getBindingResult().getFieldErrors().forEach(
			  error -> errors.put(error.getField(), error.getDefaultMessage()));
	  return ResponseEntity.badRequest().body(errors);
  }
  
  
  @ExceptionHandler(OrderNotFoundException.class)
  public ResponseEntity<Map<String,String>> handleOrderNotFoundException(
		  OrderNotFoundException ex){
	  
	  Map<String, String>errors = new HashMap<>();
	  errors.put("message", "Order not found");
	  return ResponseEntity.badRequest().body(errors);

	  
  }
  
}
