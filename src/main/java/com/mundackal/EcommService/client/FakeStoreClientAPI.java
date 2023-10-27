package com.mundackal.EcommService.client;


import com.mundackal.EcommService.dto.FakeStoreAPIResponseDTO;
import com.mundackal.EcommService.dto.ProductRequestDTO;
import com.mundackal.EcommService.dto.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class FakeStoreClientAPI {

    private String FakeStoreAPIURL;
    private String FakeStoreAPIPath;
    private RestTemplateBuilder restTemplateBuilder;

    public FakeStoreClientAPI(@Value("${fakestore.api.url}") String fakeStoreAPIURL, @Value("${fakestore.api.path.products}")String fakeStoreAPIPath, RestTemplateBuilder restTemplateBuilder) {
        FakeStoreAPIURL = fakeStoreAPIURL;
        FakeStoreAPIPath = fakeStoreAPIPath;
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public FakeStoreAPIResponseDTO[] getAllProducts() {
        RestTemplate rt = restTemplateBuilder.build();
        FakeStoreAPIResponseDTO[] receivedArray = rt.getForEntity(FakeStoreAPIURL+FakeStoreAPIPath, FakeStoreAPIResponseDTO[].class).getBody();
        return receivedArray;
    }

    public FakeStoreAPIResponseDTO getProductById(int id) {
        RestTemplate rt = restTemplateBuilder.build();
        return rt.getForEntity(FakeStoreAPIURL+FakeStoreAPIPath+"/"+id, FakeStoreAPIResponseDTO.class).getBody();
    }

    public FakeStoreAPIResponseDTO createProduct(ProductRequestDTO product) {
        RestTemplate rt = restTemplateBuilder.build();
        return rt.postForEntity(FakeStoreAPIURL+FakeStoreAPIPath,product,FakeStoreAPIResponseDTO.class).getBody();
    }

    public ProductResponseDTO updateProduct(int id, ProductRequestDTO updatedProductRequestDTO) {
        return null;
    }

    public void deleteProduct(int id) {
        RestTemplate rt = restTemplateBuilder.build();
        rt.delete(FakeStoreAPIURL+FakeStoreAPIPath+"/"+id);
    }
}
