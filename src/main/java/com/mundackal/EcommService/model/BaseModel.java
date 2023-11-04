package com.mundackal.EcommService.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;


import java.util.UUID;

@Getter
@Setter
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(generator = "UUIDGenerator")
    @GenericGenerator(name = "UUIDGenerator",strategy = "uuid2")
    @Column(name = "id",nullable = false,updatable = false)
    private UUID id;
}
