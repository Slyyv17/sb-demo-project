package com.sb_demo_app.sbdemoapp.service;

import com.sb_demo_app.sbdemoapp.model.Product;
import com.sb_demo_app.sbdemoapp.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    private final List<Product> products = Arrays.asList(
            new Product(1L, "Samsung", 900.00, "The Best Smart Phone ever"),
            new Product(2L, "Redmi", 800.00, "Almost like IOS"),
            new Product(3L, "Huawei", 500.00, "Underrated actually"),
            new Product(4L, "Pixel", 600.00, "Best camera Smart Phones")
    );

    // Manually define the constructor
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Getting / Retrieving the products
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    // Creating / Saving list of products
    @PostConstruct
    public List<Product> saveProducts() {
        return productRepository.saveAll(products);
    }
}
