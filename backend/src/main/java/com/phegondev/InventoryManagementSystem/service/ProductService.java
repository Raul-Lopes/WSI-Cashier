package com.phegondev.InventoryManagementSystem.service;

import com.phegondev.InventoryManagementSystem.dto.ProductDTO;
import com.phegondev.InventoryManagementSystem.dto.Response;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);
    Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);
    Response getAllProducts();
    Response getProductById(Long id);
    Response deleteProduct(Long id);
}
