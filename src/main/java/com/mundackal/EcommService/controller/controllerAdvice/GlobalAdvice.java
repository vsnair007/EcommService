package com.mundackal.EcommService.controller.controllerAdvice;

import com.mundackal.EcommService.dto.ErrorResponseDTO;
import com.mundackal.EcommService.dto.ProductResponseDTO;
import com.mundackal.EcommService.exception.ProductNotFound;
import com.mundackal.EcommService.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalAdvice {

    @ExceptionHandler(value = ProductNotFound.class)
    public ResponseEntity<ErrorResponseDTO> ProductNotFoundHandler(Exception e){
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
        errorResponseDTO.setMessage(e.getMessage());
        errorResponseDTO.setStatusCode(404);
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.NOT_FOUND);
    }

}
