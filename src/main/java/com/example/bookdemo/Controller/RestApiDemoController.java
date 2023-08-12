package com.example.bookdemo.Controller;


import com.example.bookdemo.DTO.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                CoffeDTO;
import com.example.bookdemo.DTO.CoffeeRecord;
import com.example.bookdemo.Entity.Coffee;
import jakarta.validation.Valid;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestApiDemoController {


    @GetMapping("/coffee")
    public ResponseEntity<String> test() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "text/plain;");
        return ResponseEntity.ok().headers(headers).body("{\" name\" : \" milad \"}");
    }


    @PostMapping("/coffee")
    public String createCoffee(@Valid @RequestBody CoffeDTO c) {
       return c.toString();
    }

    @PostMapping("/r")
    public String createR(@Valid @RequestBody CoffeeRecord c) {
        return c.toString();
    }

}

