package com.sb_demo_app.sbdemoapp.repository;

import com.sb_demo_app.sbdemoapp.model.Product;

import java.util.Arrays;
import java.util.List;

public interface ProductRepository {
    List<Product> products = Arrays.asList(
            new Product(1L, "Samsung", 100.50, "Best Smart Phone"), // Long, String, Double, String
            new Product(2L, "Redmi", 800.00, "Almost like iOS"),
            new Product(3L, "Huawei", 500.00, "Underrated actually"),
            new Product(4L, "Pixel", 600.00, "Best camera Smart Phones")
    );
}
