package com.spharosacademy.jpa.project.spharosmvcandjpa.product.service;

import com.spharosacademy.jpa.project.spharosmvcandjpa.product.model.ProductDetailImg;
import java.util.List;

public interface ProductDetailImgService {

    List<ProductDetailImg> getAllByProductId(Long productId);

}
