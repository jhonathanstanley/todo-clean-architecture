package dev.stanley.todocleanarchitecture.adapters;

import dev.stanley.todocleanarchitecture.core.model.TaskModel;


public interface TaskGateway {
    void createTask(TaskModel task);
}
