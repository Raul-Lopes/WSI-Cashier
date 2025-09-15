package com.phegondev.InventoryManagementSystem.service;

import com.phegondev.InventoryManagementSystem.dto.CategoryDTO;
import com.phegondev.InventoryManagementSystem.dto.Response;

public interface CategoryService {
    Response createCategory(CategoryDTO categoryDTO);
    Response getAllCategories();
    Response getCategoryById(Long id);
    Response updateCategory(Long id, CategoryDTO categoryDTO);
    Response deleteCategory(Long id);
}
