package com.mundackal.EcommService.repository;

import com.mundackal.EcommService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Product, UUID> {
}
