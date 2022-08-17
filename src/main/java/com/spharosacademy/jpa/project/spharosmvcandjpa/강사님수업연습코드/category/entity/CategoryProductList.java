package com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.category.entity;

import com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.product.model.Product;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CategoryProductList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CategorySmall categorySmall;
    @ManyToOne
    private CategoryTop categoryTop;
    @ManyToOne
    private CategoryMiddle categoryMiddle;

    @ManyToOne
    private Product product;

}
