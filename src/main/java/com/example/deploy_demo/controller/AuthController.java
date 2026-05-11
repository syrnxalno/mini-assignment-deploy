package com.example.deploy_demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.deploy_demo.util.JwtUtil;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> request) {
        String username = request.get("username");

        // dummy login (no DB for simplicity)
        String token = jwtUtil.generateToken(username);

        return Map.of("token", token);
    }
}