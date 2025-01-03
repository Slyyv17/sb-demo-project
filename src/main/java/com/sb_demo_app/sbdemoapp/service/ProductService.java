package com.sb_demo_app.sbdemoapp.service;

import com.sb_demo_app.sbdemoapp.model.Product;
import com.sb_demo_app.sbdemoapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {



    public List<Product> getProducts() {

        return ProductRepository.products;
    }
}
