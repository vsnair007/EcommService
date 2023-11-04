package com.mundackal.EcommService.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProductsResponsesDTO {
    List<ProductResponseDTO> ProductResponses;

    public ProductsResponsesDTO() {
        ProductResponses = new ArrayList<ProductResponseDTO>();
    }
}
