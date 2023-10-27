package com.mundackal.EcommService.controller;

import com.mundackal.EcommService.dto.ProductRequestDTO;
import com.mundackal.EcommService.dto.ProductResponseDTO;
import com.mundackal.EcommService.exception.ProductNotFound;
import com.mundackal.EcommService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class ProductController {

    @Autowired
    public ProductController( @Qualifier("fakeService") ProductService productService) {
        this.productService = productService;
    }


    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity getAllProduct() throws ProductNotFound {
        return ResponseEntity.ok(productService.getAllProducts());
    }
    @GetMapping("/products/{id}")
    public ResponseEntity getProduct(@PathVariable int id) throws ProductNotFound {
        return ResponseEntity.ok(productService.getProductById(id));
    }
    @PostMapping("/products")
    public ResponseEntity createProduct(@RequestBody  ProductRequestDTO productRequestDTO) throws ProductNotFound {
        return ResponseEntity.ok(productService.createProduct(productRequestDTO));
    }
//    @PutMapping("/products")
//    public ResponseEntity updateProduct(ProductRequestDTO productRequestDTO){
//    }
    @DeleteMapping("/products/{id}")
    public ResponseEntity deleteProduct(@PathVariable int id) throws ProductNotFound {
        return ResponseEntity.ok(productService.deleteProduct(id));
    }
}
