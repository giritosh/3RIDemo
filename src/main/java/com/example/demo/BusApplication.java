package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BusApplication {
    @GetMapping("/mybus")
    public String getData() {
        return "Please Book your Bus Ticket , Giritosh Express Lines";
    }
}
