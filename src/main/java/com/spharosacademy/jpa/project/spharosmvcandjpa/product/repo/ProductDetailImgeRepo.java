package com.spharosacademy.jpa.project.spharosmvcandjpa.product.repo;

import com.spharosacademy.jpa.project.spharosmvcandjpa.product.model.ProductDetailImg;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailImgeRepo extends JpaRepository<ProductDetailImg, Long> {


    List<ProductDetailImg> findAllByProductId(Long productId);


}