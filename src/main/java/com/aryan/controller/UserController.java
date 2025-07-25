
package com.aryan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aryan.user.User;

@RestController
public class UserController {
    
    @GetMapping("/user")
    public User getUser() {
        return new User(1, "Arygg", "aryan@example.com");
    }
    
}
