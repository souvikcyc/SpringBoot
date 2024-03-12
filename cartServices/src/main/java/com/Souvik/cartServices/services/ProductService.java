package com.Souvik.cartServices.services;

import com.Souvik.cartServices.dtos.FakeStoreProductDto;
import com.Souvik.cartServices.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getSingleProduct(Long id);

    FakeStoreProductDto createProduct(Product product);
    List<String> getCategory();

    void deleteProduct(Long id);

    void updateProduct(Product product);

    List<Product> getProductByCategory(String CategoryN);
}
