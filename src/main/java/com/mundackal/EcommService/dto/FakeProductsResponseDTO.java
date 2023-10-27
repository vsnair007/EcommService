package com.mundackal.EcommService.dto;

import com.mundackal.EcommService.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FakeProductsResponseDTO {
    private List<FakeStoreAPIResponseDTO> products;
    public FakeProductsResponseDTO(){
        products = new ArrayList<FakeStoreAPIResponseDTO>();
    }
}
