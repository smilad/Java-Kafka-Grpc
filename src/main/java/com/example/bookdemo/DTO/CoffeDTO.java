package com.example.bookdemo.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoffeDTO {
    @Email(message = "ایمیل را مثل آدم وارد کنید")
    private String name;
    @Min(value = 10,message = "ریدی")
    private int price;

}

