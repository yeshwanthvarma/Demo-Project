package com.example.demo.repository;

import com.example.demo.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Changing class to interface and extending JpaRepository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
