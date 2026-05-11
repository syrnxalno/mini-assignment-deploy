package com.example.deploy_demo;

import com.example.deploy_demo.controller.TaskController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

public class TaskControllerTest {

    @Test
    void testAddTask() {
        TaskController controller = new TaskController();

        String response = controller.addTask(Map.of("task", "Learn Spring"));

        assertEquals("Task added", response);
    }
}