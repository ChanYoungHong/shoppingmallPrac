package com.spharosacademy.jpa.project.spharosmvcandjpa.product.repo;

import com.spharosacademy.jpa.project.spharosmvcandjpa.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
