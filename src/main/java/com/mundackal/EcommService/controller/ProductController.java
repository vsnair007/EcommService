package com.mundackal.EcommService.controller;

import com.mundackal.EcommService.dto.ProductResponseDTO;
import com.mundackal.EcommService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public ResponseEntity getAllProduct(){
        ProductResponseDTO productResponseDTO =  productService.getProducts();
        return ResponseEntity.ok(productResponseDTO);
    }

}
