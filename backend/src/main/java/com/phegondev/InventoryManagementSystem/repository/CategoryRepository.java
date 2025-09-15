package com.phegondev.InventoryManagementSystem.repository;

import com.phegondev.InventoryManagementSystem.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
