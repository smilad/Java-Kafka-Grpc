package com.example.bookdemo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "coffe")
@Entity
public class Coffee {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private  Long id;

    private String name;

}
