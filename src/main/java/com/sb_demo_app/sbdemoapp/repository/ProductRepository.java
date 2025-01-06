package com.sb_demo_app.sbdemoapp.repository;

import com.sb_demo_app.sbdemoapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository - It is optional because I extended it already to the jpa already

// Extending to the Product Class and the data type of the ID
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
