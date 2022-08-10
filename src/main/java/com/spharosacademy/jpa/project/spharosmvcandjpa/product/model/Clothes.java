package com.spharosacademy.jpa.project.spharosmvcandjpa.product.model;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Entity
public class Clothes extends Product {

    private String size;
    private String color;

}
