package com.mundackal.EcommService.service;

import com.mundackal.EcommService.dto.FakeProductsResponseDTO;
import com.mundackal.EcommService.dto.ProductRequestDTO;
import com.mundackal.EcommService.dto.ProductResponseDTO;
import com.mundackal.EcommService.exception.ProductNotFound;
import com.mundackal.EcommService.model.Product;

public interface ProductService {
    //getAll
    FakeProductsResponseDTO getAllProducts() throws ProductNotFound;
    //getById
    ProductResponseDTO getProductById(int id) throws ProductNotFound;
    //create/post new product
    ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO) throws ProductNotFound;
    //Update
    ProductResponseDTO updateProduct(int id, ProductRequestDTO updatedProductRequestDTO);

    //Delete
    ProductResponseDTO deleteProduct(int id) throws ProductNotFound;
}
