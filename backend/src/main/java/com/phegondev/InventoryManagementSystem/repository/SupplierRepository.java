package com.phegondev.InventoryManagementSystem.repository;

import com.phegondev.InventoryManagementSystem.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
