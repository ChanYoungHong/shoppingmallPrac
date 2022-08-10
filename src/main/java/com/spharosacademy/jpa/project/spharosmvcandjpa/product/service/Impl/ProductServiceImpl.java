package com.spharosacademy.jpa.project.spharosmvcandjpa.product.service.Impl;

import com.spharosacademy.jpa.project.spharosmvcandjpa.product.dto.response.ProductDetailOutputDto;
import com.spharosacademy.jpa.project.spharosmvcandjpa.product.model.Product;
import com.spharosacademy.jpa.project.spharosmvcandjpa.product.repo.ProductDetailImgeRepo;
import com.spharosacademy.jpa.project.spharosmvcandjpa.product.repo.ProductRepo;
import com.spharosacademy.jpa.project.spharosmvcandjpa.product.service.ProductService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final ProductDetailImgeRepo productDetailImgeRepo;

    @Override
    public ProductDetailOutputDto getProduct(Long productId) {

        Optional<Product> product = productRepo.findById(productId);

        if(product.isPresent()){
            ProductDetailOutputDto.builder()
                .id(product.get().getId())
                .name(product.get().getName())
                .price(product.get().getPrice())
                .made(product.get().getMade())
                .titleImgUrl(product.get().getDescription())
                .des(product.get().getDescription())
                .productDetailImgList(productDetailImgeRepo.findAllByProductId(productId))
                .build();
        }

        return ProductDetailOutputDto.builder()
            .id(productRepo.findById(productId).get().getId())
            .build();
    }


}
