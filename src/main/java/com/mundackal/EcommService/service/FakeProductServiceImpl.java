package com.mundackal.EcommService.service;

import com.mundackal.EcommService.dto.FakeProductsResponseDTO;
import com.mundackal.EcommService.model.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("fakeService")
public class FakeProductServiceImpl implements ProductService{

    private RestTemplateBuilder restTemplateBuilder;

    public FakeProductServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public FakeProductsResponseDTO getAllProducts() {
        RestTemplate rt = restTemplateBuilder.build();
        return rt.getForEntity("https://fakestoreapi.com/products", FakeProductsResponseDTO.class).getBody();
    }

    @Override
    public Product getProductById(int id) {
        RestTemplate rt = restTemplateBuilder.build();
        return rt.getForEntity("https://fakestoreapi.com/products/"+id, Product.class).getBody();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(int id, Product updatedProduct) {
        return null;
    }

    @Override
    public Product deleteProduct(int id) {
        return null;
    }
}
