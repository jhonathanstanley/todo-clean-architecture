package dev.stanley.todocleanarchitecture.core.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;
@Getter
@Setter
public abstract class AbstractModel {
    private UUID id;
    private Date createdAt;
}
