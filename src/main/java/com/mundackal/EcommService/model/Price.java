package com.mundackal.EcommService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Price extends BaseModel{
    private double amount;
    private String currency;
    private int discountPercentage;
}
