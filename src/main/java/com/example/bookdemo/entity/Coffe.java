package com.example.bookdemo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Coffe {
    @Id
    private final String ID;
    private String name;
}
