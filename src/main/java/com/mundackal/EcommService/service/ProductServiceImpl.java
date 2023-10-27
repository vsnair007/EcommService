package com.mundackal.EcommService.service;

import com.mundackal.EcommService.dto.FakeProductsResponseDTO;
import com.mundackal.EcommService.dto.ProductRequestDTO;
import com.mundackal.EcommService.dto.ProductResponseDTO;
import com.mundackal.EcommService.model.Product;
import org.springframework.stereotype.Service;

@Service("ProductService")
public class ProductServiceImpl implements ProductService{

    @Override
    public FakeProductsResponseDTO getAllProducts() {
        return null;
    }

    @Override
    public ProductResponseDTO getProductById(int id) {
        return null;
    }

    @Override
    public ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO) {
        return null;
    }

    @Override
    public ProductResponseDTO updateProduct(int id, ProductRequestDTO updatedProductRequestDTO) {
        return null;
    }

    @Override
    public ProductResponseDTO deleteProduct(int id) {
        return null;
    }
}
