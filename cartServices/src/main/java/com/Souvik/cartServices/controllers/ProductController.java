package com.Souvik.cartServices.controllers;

import com.Souvik.cartServices.dtos.FakeStoreProductDto;
import com.Souvik.cartServices.models.Product;
import com.Souvik.cartServices.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/hello")
    public static String sayHello(){
        return  "Hello World";
    }


    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id) {
        return productService.getSingleProduct(id);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/category")
    public List<String> getAllCategories(){
        return productService.getCategory();
    }

    @DeleteMapping("/products/{id}")
    public void deletebyId(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }

    @PutMapping("/update")
        public void updateProduct(@RequestBody Product p){
            productService.updateProduct(p);
        }

        @PostMapping("/products")
        public FakeStoreProductDto createProduct(@RequestBody Product p){
            return productService.createProduct(p);
        }

    @GetMapping("/products/category/{categoryN}")
    public List<Product> getInCategory(@PathVariable("categoryN") String categoryName) {
        return productService.getProductByCategory(categoryName);
    }
}
