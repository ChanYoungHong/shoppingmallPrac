package com.spharosacademy.jpa.project.spharosmvcandjpa.product.service;

import com.spharosacademy.jpa.project.spharosmvcandjpa.product.dto.response.ProductDetailOutputDto;

public interface ProductService {

    ProductDetailOutputDto getProduct(Long id);

}
