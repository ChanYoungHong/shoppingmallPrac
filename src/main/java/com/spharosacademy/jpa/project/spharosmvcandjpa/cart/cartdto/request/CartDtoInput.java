package com.spharosacademy.jpa.project.spharosmvcandjpa.cart.cartdto.request;

import lombok.Data;

// 받아오는 값이다
@Data
public class CartDtoInput {

    private Long userId;
    private Long productId;
    private int qty;

}
