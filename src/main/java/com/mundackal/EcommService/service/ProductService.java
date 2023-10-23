package com.mundackal.EcommService.service;

import com.mundackal.EcommService.dto.FakeProductsResponseDTO;
import com.mundackal.EcommService.dto.ProductResponseDTO;
import com.mundackal.EcommService.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    //getAll
    FakeProductsResponseDTO getAllProducts();
    //getById
    Product getProductById(int id);
    //create/post new product
    Product createProduct(Product product);
    //Update
    Product updateProduct(int id, Product updatedProduct);
    //Delete
    Product deleteProduct(int id);
}
