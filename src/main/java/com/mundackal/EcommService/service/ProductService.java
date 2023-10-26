package com.mundackal.EcommService.service;

import com.mundackal.EcommService.dto.FakeProductsResponseDTO;
import com.mundackal.EcommService.dto.ProductRequestDTO;
import com.mundackal.EcommService.model.Product;

public interface ProductService {
    //getAll
    FakeProductsResponseDTO getAllProducts();
    //getById
    Product getProductById(int id);
    //create/post new product
    Product createProduct(ProductRequestDTO productRequestDTO);
    //Update
    Product updateProduct(int id, ProductRequestDTO updatedProductRequestDTO);

    //Delete
    Product deleteProduct(int id);
}
