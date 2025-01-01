package com.sb_demo_app.sbdemoapp.controller;

import com.sb_demo_app.sbdemoapp.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    // Ensure proper types in the constructor
    public List<Product> products = Arrays.asList(
            new Product(1L, "Samsung", 100.50, "Best Smart Phone"), // Long, String, Double, String
            new Product(2L, "Redmi", 800.00, "Almost like iOS"),
            new Product(3L, "Huawei", 500.00, "Underrated actually"),
            new Product(4L, "Pixel", 600.00, "Best camera Smart Phones")
    );

    @GetMapping("/all")
    public List<Product> getProducts() {
        return products;
    }
}
