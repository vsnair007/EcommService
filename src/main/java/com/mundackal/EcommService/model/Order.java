package com.mundackal.EcommService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "Ecomm_Order")
public class Order extends BaseModel{

    @ManyToMany
    private List<Product> productList;

}
