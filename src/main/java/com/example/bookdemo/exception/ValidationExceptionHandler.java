package com.example.bookdemo.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.hibernate.mapping.Any;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Any> handleValidationException(MethodArgumentNotValidException ex, HttpServletRequest request) {
        // Get the list of FieldError objects from the exception
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        // Add the field errors to the request attributes
        request.setAttribute("errors", fieldErrors);

        return ResponseEntity.badRequest().body((Any) fieldErrors);
    }

}
