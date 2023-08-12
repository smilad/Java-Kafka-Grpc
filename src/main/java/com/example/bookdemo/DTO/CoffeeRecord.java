package com.example.bookdemo.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;

public record CoffeeRecord(
        @Email(message = "ایمیل را مثل آدم وارد کنید") String name,
        @Min(value = 10,message = "ریدی") int price

) {

}
