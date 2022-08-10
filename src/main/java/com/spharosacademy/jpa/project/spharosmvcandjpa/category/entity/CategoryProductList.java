package com.spharosacademy.jpa.project.spharosmvcandjpa.category.entity;

import com.spharosacademy.jpa.project.spharosmvcandjpa.product.model.Product;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CategoryProductList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CategorySmall categorySmall;

    @ManyToOne
    private Product product;

}
