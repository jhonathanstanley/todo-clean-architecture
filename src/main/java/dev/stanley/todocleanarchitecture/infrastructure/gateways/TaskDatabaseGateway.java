package dev.stanley.todocleanarchitecture.infrastructure.gateways;

import dev.stanley.todocleanarchitecture.adapters.TaskGateway;
import dev.stanley.todocleanarchitecture.core.model.TaskModel;
import dev.stanley.todocleanarchitecture.infrastructure.repositories.TaskRepository;
import dev.stanley.todocleanarchitecture.infrastructure.schema.TaskEntitySchema;
import org.springframework.stereotype.Service;

@Service
public class TaskDatabaseGateway implements TaskGateway {

    private final TaskRepository taskRepository;


    public TaskDatabaseGateway(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public void createTask(TaskModel task) {
        taskRepository.save(new TaskEntitySchema(task.getDescription(), task.getIsDone()));
    }
}
