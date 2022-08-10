package com.spharosacademy.jpa.project.spharosmvcandjpa.product.service;

import com.spharosacademy.jpa.project.spharosmvcandjpa.product.dto.response.ProductDetailOutputDto;
import com.spharosacademy.jpa.project.spharosmvcandjpa.product.model.Product;

public interface ProductService {

    ProductDetailOutputDto getProduct(Long id);

    Product addProduct(ProductDetailOutputDto productDetailOutputDto);

}
