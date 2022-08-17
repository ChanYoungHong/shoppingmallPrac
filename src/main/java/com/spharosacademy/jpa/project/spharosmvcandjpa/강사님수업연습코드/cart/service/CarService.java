package com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.cart.service;


import com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.cart.cartdto.request.CartDtoInput;
import com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.cart.cartdto.response.CartDtoOutput;
import com.spharosacademy.jpa.project.spharosmvcandjpa.강사님수업연습코드.cart.model.Cart;
import java.util.List;

public interface CarService {

    Cart addCart(CartDtoInput cartDtoInput);
    List<CartDtoOutput> getAll();
    CartDtoOutput getCartById(Long id);

}
