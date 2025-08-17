package com.visionexl.demo_rest_apis.service;

import com.visionexl.demo_rest_apis.dtos.TaskDto;
import org.springframework.core.task.TaskDecorator;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    List<TaskDto> tasks = new ArrayList<>();

    public void createTask(TaskDto task) {
        tasks.add(task);
    }

    public List<TaskDto> getAllTasks() {
        return tasks;
    }

    public void updateTask(TaskDto taskDto) {
        //TODO: logic to update the task
    }

    public void deleteTask(TaskDto taskDto) {
        //TODO: delete task logic
    }
}
