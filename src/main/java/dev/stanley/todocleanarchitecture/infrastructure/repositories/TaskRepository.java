package dev.stanley.todocleanarchitecture.infrastructure.repositories;

import dev.stanley.todocleanarchitecture.infrastructure.schema.TaskEntitySchema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<TaskEntitySchema, UUID> {
}
