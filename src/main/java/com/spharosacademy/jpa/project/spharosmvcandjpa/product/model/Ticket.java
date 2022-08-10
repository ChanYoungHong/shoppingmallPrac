package com.spharosacademy.jpa.project.spharosmvcandjpa.product.model;

import javax.persistence.Entity;

@Entity
public class Ticket extends Product {

    private String ticketNum;
    private String ticketBrand;

}
