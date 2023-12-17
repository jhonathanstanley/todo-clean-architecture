package dev.stanley.todocleanarchitecture.controllers;

import dev.stanley.todocleanarchitecture.core.dtos.InputTaskDTO;
import dev.stanley.todocleanarchitecture.core.usecases.CreateTaskUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/task")
public class TaskController {

    private final CreateTaskUseCase createTaskUseCase;

    public TaskController(CreateTaskUseCase createTaskUseCase){this.createTaskUseCase = createTaskUseCase;}

    @PostMapping("/new")
    public ResponseEntity<String> addTask(@RequestBody InputTaskDTO input){
        try {
            createTaskUseCase.createTask(input);
            return ResponseEntity.ok("Task created successfully");
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while creating the task");
        }
    }

}
