package dev.stanley.todocleanarchitecture.adapters;
import dev.stanley.todocleanarchitecture.core.model.TaskModel;


public interface ITaskGateway {
    void createTask(TaskModel task);
}
