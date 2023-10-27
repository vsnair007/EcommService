package com.mundackal.EcommService.mapper;


import com.mundackal.EcommService.dto.*;

public class ProductMapper {
    public static ProductResponseDTO FakeStoreAPIResponseDTOToProductResponseMapper(FakeStoreAPIResponseDTO fakeStoreAPIResponseDTO){
        ProductResponseDTO productResponseDTO = new ProductResponseDTO();
        productResponseDTO.setId(fakeStoreAPIResponseDTO.getId());
        productResponseDTO.setCategory(fakeStoreAPIResponseDTO.getCategory());
        productResponseDTO.setTitle(fakeStoreAPIResponseDTO.getTitle());
        productResponseDTO.setPrice(fakeStoreAPIResponseDTO.getPrice());
        productResponseDTO.setImage(fakeStoreAPIResponseDTO.getImage());
        productResponseDTO.setDescription(fakeStoreAPIResponseDTO.getImage());
        return productResponseDTO;
    }

    public static FakeStoreAPIRequestDTO FakeStoreClientToProductResponseMapper(ProductRequestDTO productRequestDTO){
        FakeStoreAPIRequestDTO fakeStoreAPIRequestDTO = new FakeStoreAPIRequestDTO();
        fakeStoreAPIRequestDTO.setCategory(productRequestDTO.getCategory());
        fakeStoreAPIRequestDTO.setDescription(productRequestDTO.getDescription());
        fakeStoreAPIRequestDTO.setTitle(productRequestDTO.getTitle());
        fakeStoreAPIRequestDTO.setPrice(productRequestDTO.getPrice());
        fakeStoreAPIRequestDTO.setImage(productRequestDTO.getImage());
        return fakeStoreAPIRequestDTO;
    }
    public static FakeProductsResponseDTO  FakeStoreAPIResponseDTOSToFakeProductsResponseDTO(FakeStoreAPIResponseDTO[] fakeStoreAPIResponseDTOS){
        FakeProductsResponseDTO resultingArray = new FakeProductsResponseDTO();
        for(FakeStoreAPIResponseDTO p : fakeStoreAPIResponseDTOS ){
            resultingArray.getProducts().add(p);
        }
        return resultingArray;
    }

}
