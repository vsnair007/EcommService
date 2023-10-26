package com.mundackal.EcommService.service;

import com.mundackal.EcommService.dto.FakeProductsResponseDTO;
import com.mundackal.EcommService.dto.ProductRequestDTO;
import com.mundackal.EcommService.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("fakeService")
public class FakeProductServiceImpl implements ProductService{

    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    public FakeProductServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public FakeProductsResponseDTO getAllProducts() {
        RestTemplate rt = restTemplateBuilder.build();
        Product[] recievedArray = rt.getForEntity("https://fakestoreapi.com/products", Product[].class).getBody();
        FakeProductsResponseDTO resultingArray = new FakeProductsResponseDTO();
        for(Product p : recievedArray ){
            resultingArray.getProducts().add(p);
        }
        return resultingArray;
    }

    @Override
    public Product getProductById(int id) {
        RestTemplate rt = restTemplateBuilder.build();
        return rt.getForEntity("https://fakestoreapi.com/products/"+id, Product.class).getBody();
    }

    @Override
    public Product createProduct(ProductRequestDTO product) {
        String url = "https://fakestoreapi.com/products";
        RestTemplate rt = restTemplateBuilder.build();
        return rt.postForEntity(url,product,Product.class).getBody();
    }

    @Override
    public Product updateProduct(int id, ProductRequestDTO updatedProductRequestDTO) {
        return null;
    }

    @Override
    public Product deleteProduct(int id) {
        String url = "https://fakestoreapi.com/products/"+id;
        Product deletedProduct = getProductById(id);
        RestTemplate rt = restTemplateBuilder.build();
        rt.delete(url);
        return deletedProduct;
    }
}
