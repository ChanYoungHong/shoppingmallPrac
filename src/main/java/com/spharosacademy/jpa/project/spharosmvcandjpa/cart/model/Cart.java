package com.spharosacademy.jpa.project.spharosmvcandjpa.cart.model;

import com.spharosacademy.jpa.project.spharosmvcandjpa.product.model.Product;
import com.spharosacademy.jpa.project.spharosmvcandjpa.user.model.User;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int qty;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;

}
