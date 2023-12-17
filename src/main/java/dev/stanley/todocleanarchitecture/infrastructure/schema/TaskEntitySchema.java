package dev.stanley.todocleanarchitecture.infrastructure.schema;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_TASK")
public class TaskEntitySchema extends AbstractEntitySchema {
    private String description;
    private Boolean isDone;

    public TaskEntitySchema(String description, Boolean isDone) {
        super();
    }

    public TaskEntitySchema() {

    }
}
