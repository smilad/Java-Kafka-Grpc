package com.example.bookdemo.Service;

import com.example.bookdemo.Entity.Coffee;
import com.example.bookdemo.Repository.CoffeeRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {

    @Autowired
    private CoffeeRepository coffeRepository;



    public Coffee createCoffe(Coffee c) {

       return this.coffeRepository.save(c);
    }

}
