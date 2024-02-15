package com.jwtSecurity.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("secured page");
    }
}
