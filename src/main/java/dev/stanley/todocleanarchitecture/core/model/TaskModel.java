package dev.stanley.todocleanarchitecture.core.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskModel extends AbstractModel{
    private String description;
    private Boolean isDone;

    public TaskModel(String description, Boolean done) {
        super();
    }
}
