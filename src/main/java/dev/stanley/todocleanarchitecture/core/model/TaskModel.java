package dev.stanley.todocleanarchitecture.core.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TaskModel extends AbstractModel{
    private String description;
    private Boolean isDone;

    public TaskModel(String description, Boolean done) {
        super();
        this.description = description;
        this.isDone = done;
        this.setCreatedAt(LocalDateTime.now());
    }
}
