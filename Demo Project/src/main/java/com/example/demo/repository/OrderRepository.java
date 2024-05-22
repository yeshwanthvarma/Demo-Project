package com.example.demo.repository;

import com.example.demo.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

// Changing class to interface and extending JpaRepository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
