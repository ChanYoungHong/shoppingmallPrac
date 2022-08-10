package com.spharosacademy.jpa.project.spharosmvcandjpa.cart.cartdto.response;


import com.spharosacademy.jpa.project.spharosmvcandjpa.cart.model.Cart;
import com.spharosacademy.jpa.project.spharosmvcandjpa.product.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartDtoOutput {

    private Long id;
    private String productName;
    private int price;
    private int qty;

    public static CartDtoOutput of(Cart cart, Product product) {

        return CartDtoOutput.builder()
            .id(cart.getId())
            .qty(cart.getQty())
            .productName(product.getName())
            .price(product.getPrice())
            .build();

    }
}
