package com.mundackal.EcommService.service;

import com.mundackal.EcommService.dto.FakeProductsResponseDTO;
import com.mundackal.EcommService.dto.ProductRequestDTO;
import com.mundackal.EcommService.dto.ProductResponseDTO;
import com.mundackal.EcommService.exception.NoProductException;
import com.mundackal.EcommService.exception.ProductNotFound;
import com.mundackal.EcommService.model.Product;
import com.mundackal.EcommService.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.mundackal.EcommService.utils.ProductUtils.isNull;

@Service("ProductService")
public class ProductServiceImpl implements ProductService{

    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public FakeProductsResponseDTO getAllProducts() throws ProductNotFound {
        List<Product> products = productRepository.findAll();
        if(isNull(products)){
            throw new ProductNotFound("No Products Found");
        }
        return null;
    }

    @Override
    public ProductResponseDTO getProductById(int id) throws ProductNotFound {
        return null;
    }

    @Override
    public ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO) throws ProductNotFound {
        return null;
    }

    @Override
    public ProductResponseDTO updateProduct(int id, ProductRequestDTO updatedProductRequestDTO) {
        return null;
    }

    @Override
    public ProductResponseDTO deleteProduct(int id) throws ProductNotFound {
        return null;
    }
}
