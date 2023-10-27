package com.mundackal.EcommService.client;

import com.mundackal.EcommService.dto.FakeProductsResponseDTO;
import com.mundackal.EcommService.dto.FakeStoreAPIResponseDTO;
import com.mundackal.EcommService.dto.ProductRequestDTO;
import com.mundackal.EcommService.dto.ProductResponseDTO;
import com.mundackal.EcommService.mapper.ProductMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//Allows to use static methods without using classname directly. Promotes readability
import static com.mundackal.EcommService.mapper.ProductMapper.FakeStoreAPIResponseDTOToProductResponseMapper;
import static com.mundackal.EcommService.mapper.ProductMapper.FakeStoreAPIResponseDTOSToFakeProductsResponseDTO;
@Component
public class FakeStoreClientAPI {

    private String FakeStoreAPIURL;
    private String FakeStoreAPIPath;
    private RestTemplateBuilder restTemplateBuilder;

    public FakeStoreClientAPI( RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public FakeStoreAPIResponseDTO[] getAllProducts() {
        RestTemplate rt = restTemplateBuilder.build();
        FakeStoreAPIResponseDTO[] receivedArray = rt.getForEntity("https://fakestoreapi.com/products", FakeStoreAPIResponseDTO[].class).getBody();
        return receivedArray;
    }

    public FakeStoreAPIResponseDTO getProductById(int id) {
        RestTemplate rt = restTemplateBuilder.build();
        return rt.getForEntity("https://fakestoreapi.com/products/"+id, FakeStoreAPIResponseDTO.class).getBody();
    }

    public FakeStoreAPIResponseDTO createProduct(ProductRequestDTO product) {
        String url = "https://fakestoreapi.com/products";
        RestTemplate rt = restTemplateBuilder.build();
        return rt.postForEntity(url,product,FakeStoreAPIResponseDTO.class).getBody();
    }

    public ProductResponseDTO updateProduct(int id, ProductRequestDTO updatedProductRequestDTO) {
        return null;
    }

    public void deleteProduct(int id) {
        String url = "https://fakestoreapi.com/products/"+id;
        RestTemplate rt = restTemplateBuilder.build();
        rt.delete(url);
    }
}
