package com.spharosacademy.jpa.project.spharosmvcandjpa.product.service.Impl;

import com.spharosacademy.jpa.project.spharosmvcandjpa.product.model.ProductDetailImg;
import com.spharosacademy.jpa.project.spharosmvcandjpa.product.repo.ProductDetailImgeRepo;
import com.spharosacademy.jpa.project.spharosmvcandjpa.product.service.ProductDetailImgService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdcutDetailImlServiceImpl implements ProductDetailImgService {

    private final ProductDetailImgeRepo productDetailImgeRepo;

    @Override
    public List<ProductDetailImg> getAllByProductId(Long productId) {
        return productDetailImgeRepo.findAllByProductId(productId);
    }

}
