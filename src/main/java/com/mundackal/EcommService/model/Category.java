package com.mundackal.EcommService.model;

/*
 [
            "electronics",
            "jewelery",
            "men's clothing",
            "women's clothing"
 ]
*/

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category extends BaseModel{
    private String name;
}
