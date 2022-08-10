package com.spharosacademy.jpa.project.spharosmvcandjpa.product.model;

import com.spharosacademy.jpa.project.spharosmvcandjpa.category.entity.CategorySmall;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // 이제 JPA에서 이 엔티티를 관리하겠다라는 의미다.
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    private String titleImgUrl;
    private String titleImgTxt;
    private String description;
    private String made;

    @ManyToOne
    private CategorySmall categorySmall;

}
