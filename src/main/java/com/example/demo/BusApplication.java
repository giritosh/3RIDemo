package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class BusApplication {
    @GetMapping("/mybus")
    public String getData() {
        return "Please Book your Bus Ticket , Giri Express Lines";
    }

}
