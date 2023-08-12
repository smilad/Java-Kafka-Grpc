package com.example.bookdemo.Repository;

import com.example.bookdemo.Entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee,Long> {
}
