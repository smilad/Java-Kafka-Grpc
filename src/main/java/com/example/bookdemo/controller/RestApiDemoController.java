package com.example.bookdemo.controller;


import com.example.bookdemo.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
public class RestApiDemoController {


    @PostMapping("/coffee")
    public String CreateCoffee() {
        return "dd";
    }

}

