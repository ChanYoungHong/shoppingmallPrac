package com.spharosacademy.jpa.project.spharosmvcandjpa.product.service.Impl;

import com.spharosacademy.jpa.project.spharosmvcandjpa.category.entity.CategoryMiddle;
import com.spharosacademy.jpa.project.spharosmvcandjpa.category.entity.CategoryProductList;
import com.spharosacademy.jpa.project.spharosmvcandjpa.category.entity.CategorySmall;
import com.spharosacademy.jpa.project.spharosmvcandjpa.category.entity.CategoryTop;
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
    private final CategoryMiddle categoryMiddle;
    private final CategorySmall categorySmall;
    private final CategoryTop categoryTop;

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

    @Override
    public Product addProduct(ProductDetailOutputDto productDetailOutputDto) {

        Product product = productRepo.save(Product.builder()
                .name(productDetailOutputDto.getName())
                .price(productDetailOutputDto.getPrice())
                .titleImgUrl(productDetailOutputDto.getTitleImgUrl())
                .titleImgTxt(productDetailOutputDto.getTitleImgTxt())
            .build());

        return null;
    }


}
