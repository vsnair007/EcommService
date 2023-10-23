package com.mundackal.EcommService.service;

import com.mundackal.EcommService.dto.ProductResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceImpl implements ProductService{

    public ProductResponseDTO getProducts(){
        RestTemplate rt = new RestTemplate();
        return rt.getForEntity("https://fakestoreapi.com/products/1", ProductResponseDTO.class).getBody();
    }
}
