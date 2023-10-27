package com.mundackal.EcommService.service;

import com.mundackal.EcommService.client.FakeStoreClientAPI;
import com.mundackal.EcommService.dto.FakeProductsResponseDTO;
import com.mundackal.EcommService.dto.FakeStoreAPIResponseDTO;
import com.mundackal.EcommService.dto.ProductRequestDTO;
import com.mundackal.EcommService.dto.ProductResponseDTO;
import com.mundackal.EcommService.exception.ProductNotFound;
import com.mundackal.EcommService.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.mundackal.EcommService.mapper.ProductMapper.FakeStoreAPIResponseDTOSToFakeProductsResponseDTO;
import static com.mundackal.EcommService.mapper.ProductMapper.FakeStoreAPIResponseDTOToProductResponseMapper;
import static com.mundackal.EcommService.utils.ProductUtils.isNull;

@Service("fakeService")
public class FakeProductServiceImpl implements ProductService{

    private FakeStoreClientAPI fakeStoreClientAPI;

    public FakeProductServiceImpl(FakeStoreClientAPI fakeStoreClientAPI) {
        this.fakeStoreClientAPI = fakeStoreClientAPI;
    }

    @Override
    public FakeProductsResponseDTO getAllProducts() throws ProductNotFound {
        FakeStoreAPIResponseDTO[] fakeStoreAPIResponseDTOS = fakeStoreClientAPI.getAllProducts();
        if(isNull(fakeStoreAPIResponseDTOS)){
            throw new ProductNotFound("No Products Available");
        }
        return FakeStoreAPIResponseDTOSToFakeProductsResponseDTO(fakeStoreAPIResponseDTOS);
    }

    @Override
    public ProductResponseDTO getProductById(int id) throws ProductNotFound {
        FakeStoreAPIResponseDTO fakeStoreAPIResponseDTO = fakeStoreClientAPI.getProductById(id);
        if(isNull(fakeStoreAPIResponseDTO)){
            throw new ProductNotFound("Product not found with id " + id);
        }
        return FakeStoreAPIResponseDTOToProductResponseMapper(fakeStoreAPIResponseDTO);
    }

    @Override
    public ProductResponseDTO createProduct(ProductRequestDTO product) throws ProductNotFound {
        FakeStoreAPIResponseDTO fakeStoreAPIResponseDTO = fakeStoreClientAPI.createProduct(product);
        if(isNull(fakeStoreAPIResponseDTO)){
            throw new ProductNotFound("Product not created");
        }
        return FakeStoreAPIResponseDTOToProductResponseMapper(fakeStoreAPIResponseDTO);
    }

    @Override
    public ProductResponseDTO updateProduct(int id, ProductRequestDTO updatedProductRequestDTO) {
        return null;
    }

    @Override
    public ProductResponseDTO deleteProduct(int id) throws ProductNotFound {
        ProductResponseDTO productResponseDTO = getProductById(id);
        fakeStoreClientAPI.deleteProduct(id);
        return productResponseDTO;
    }
}
