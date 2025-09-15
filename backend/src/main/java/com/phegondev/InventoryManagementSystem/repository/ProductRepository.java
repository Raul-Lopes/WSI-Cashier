package com.phegondev.InventoryManagementSystem.repository;

import com.phegondev.InventoryManagementSystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
