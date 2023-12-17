package dev.stanley.todocleanarchitecture.infrastructure.schema;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TB_TASK")
public class TaskEntitySchema extends AbstractEntitySchema {
    private String description;
    private Boolean isDone;

    public TaskEntitySchema(String description, Boolean isDone, LocalDateTime createdAt) {
        super();
        this.description = description;
        this.isDone = isDone;
        this.setCreatedAt(createdAt);
    }

    public TaskEntitySchema() {

    }
}
