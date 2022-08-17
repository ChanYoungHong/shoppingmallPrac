package com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.cart.cartdto.request;

import lombok.Data;

// 받아오는 값이다
@Data
public class CartDtoInput {

    private Long userId;
    private Long productId;
    private int qty;

}
