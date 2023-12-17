package dev.stanley.todocleanarchitecture.core.usecases;

import dev.stanley.todocleanarchitecture.adapters.TaskGateway;
import dev.stanley.todocleanarchitecture.core.dtos.InputTaskDTO;
import dev.stanley.todocleanarchitecture.core.model.TaskModel;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskUseCase {

    private final TaskGateway taskGateway;


    public CreateTaskUseCase(TaskGateway taskGateway){
        this.taskGateway = taskGateway;
    }
    public void createTask(InputTaskDTO input){
        var task = new TaskModel(input.description(), input.isDone());
        taskGateway.createTask(task);
    }
}
