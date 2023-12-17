package dev.stanley.todocleanarchitecture.infrastructure.gateways;

import dev.stanley.todocleanarchitecture.adapters.ITaskGateway;
import dev.stanley.todocleanarchitecture.core.model.TaskModel;
import dev.stanley.todocleanarchitecture.infrastructure.repositories.TaskRepository;
import dev.stanley.todocleanarchitecture.infrastructure.schema.TaskEntitySchema;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;


public class TaskDatabaseGateway implements ITaskGateway {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskDatabaseGateway(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public void createTask(TaskModel task) {
        taskRepository.save(new TaskEntitySchema(task.getDescription(), task.getIsDone()));
    }
}
