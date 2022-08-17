package com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.product.repo;

import com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
