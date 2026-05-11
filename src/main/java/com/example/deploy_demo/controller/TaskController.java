package com.example.deploy_demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<String> tasks = new ArrayList<>();

    @GetMapping
    public List<String> getTasks() {
        return tasks;
    }

    @PostMapping
    public String addTask(@RequestBody Map<String, String> body) {
        tasks.add(body.get("task"));
        return "Task added";
    }
}