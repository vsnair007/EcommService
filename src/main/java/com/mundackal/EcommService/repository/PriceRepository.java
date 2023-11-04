package com.mundackal.EcommService.repository;

import com.mundackal.EcommService.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PriceRepository extends JpaRepository<Price, UUID> {
}