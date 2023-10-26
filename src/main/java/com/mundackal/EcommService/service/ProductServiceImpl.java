package com.mundackal.EcommService.service;

import com.mundackal.EcommService.dto.FakeProductsResponseDTO;
import com.mundackal.EcommService.dto.ProductRequestDTO;
import com.mundackal.EcommService.model.Product;
import org.springframework.stereotype.Service;

@Service("ProductService")
public class ProductServiceImpl implements ProductService{

    @Override
    public FakeProductsResponseDTO getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public Product createProduct(ProductRequestDTO product) {
        return null;
    }

    @Override
    public Product updateProduct(int id, ProductRequestDTO updatedProductRequestDTO) {
        return null;
    }

    @Override
    public Product deleteProduct(int id) {
        return null;
    }
}
