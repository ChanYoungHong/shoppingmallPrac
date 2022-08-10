package com.spharosacademy.jpa.project.spharosmvcandjpa.cart.service;


import com.spharosacademy.jpa.project.spharosmvcandjpa.cart.cartdto.request.CartDtoInput;
import com.spharosacademy.jpa.project.spharosmvcandjpa.cart.cartdto.response.CartDtoOutput;
import com.spharosacademy.jpa.project.spharosmvcandjpa.cart.model.Cart;
import java.util.List;

public interface CarService {

    Cart addCart(CartDtoInput cartDtoInput);
    List<CartDtoOutput> getAll();
    CartDtoOutput getCartById(Long id);

}
