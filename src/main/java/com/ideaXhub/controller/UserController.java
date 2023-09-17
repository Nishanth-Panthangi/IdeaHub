package com.ideaXhub.controller;

import com.ideaXhub.service.UserService;
import com.ideaXhub.view.UserRegistrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
    public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationDTO userDto) {
        userService.registerUser(userDto);
        return ResponseEntity.ok("User registered successfully");
    }
}
