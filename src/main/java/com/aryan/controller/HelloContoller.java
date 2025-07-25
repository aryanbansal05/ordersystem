package com.aryan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
