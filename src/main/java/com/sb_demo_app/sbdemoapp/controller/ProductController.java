package com.sb_demo_app.sbdemoapp.controller;

import com.sb_demo_app.sbdemoapp.model.Product;
import com.sb_demo_app.sbdemoapp.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }
}
