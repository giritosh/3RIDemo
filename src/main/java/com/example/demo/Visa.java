package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Visa {
    @GetMapping("/myVisa")
    public String getData() {
        return "Please Submit your Visa Application here.";
    }
}