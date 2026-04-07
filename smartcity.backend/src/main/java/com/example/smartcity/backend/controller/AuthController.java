package com.example.smartcity.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.smartcity.backend.model.User;
import com.example.smartcity.backend.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UserService service;

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return service.signup(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return service.login(user);
    }

    @GetMapping("/test")
    public String test() {
        User u = new User();
        u.setUsername("sita");
        u.setPassword("123");
        service.signup(u);
        return "Inserted";
    }
}