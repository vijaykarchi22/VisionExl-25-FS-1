package com.visionexl.demo_rest_apis.controllers;

import com.visionexl.demo_rest_apis.dtos.TaskDto;
import com.visionexl.demo_rest_apis.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks") // == localhost:8080/tasks
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping // GET - localhost:8080/tasks
    public List<TaskDto> getTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public String createTask(@RequestBody TaskDto dto) {
        taskService.createTask(dto);
        return "Task is created";
    }
}
