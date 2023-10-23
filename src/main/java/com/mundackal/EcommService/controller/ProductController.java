package com.mundackal.EcommService.controller;

import com.mundackal.EcommService.dto.ProductResponseDTO;
import com.mundackal.EcommService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    @Qualifier("fakeService")
    ProductService productService;

    @GetMapping("/products")
    public ResponseEntity getAllProduct(){
        return ResponseEntity.ok(productService.getAllProducts());
    }
    @GetMapping("/products/{id}")
    public ResponseEntity getProduct(@PathVariable int id){
        //id = 5;
        return ResponseEntity.ok(productService.getProductById(id));
    }

}
