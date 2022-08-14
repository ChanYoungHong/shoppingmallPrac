package com.spharosacademy.jpa.project.spharosmvcandjpa.cart.service;

import com.spharosacademy.jpa.project.spharosmvcandjpa.cart.cartdto.request.CartDtoInput;
import com.spharosacademy.jpa.project.spharosmvcandjpa.cart.cartdto.response.CartDtoOutput;
import com.spharosacademy.jpa.project.spharosmvcandjpa.cart.model.Cart;
import com.spharosacademy.jpa.project.spharosmvcandjpa.cart.repo.CartRepo;
import com.spharosacademy.jpa.project.spharosmvcandjpa.product.model.Product;
import com.spharosacademy.jpa.project.spharosmvcandjpa.product.repo.ProductRepo;
import com.spharosacademy.jpa.project.spharosmvcandjpa.user.model.User;
import com.spharosacademy.jpa.project.spharosmvcandjpa.user.repo.UserRepoo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CarService {

    private final UserRepoo userRepoo;
    private final CartRepo cartRepo;
    private final ProductRepo productRepo;

    @Override
    public Cart addCart(CartDtoInput cartDtoInput) {

        // null을 방지하기 위해서 Optional을 사용함.
        Optional<Product> product = productRepo.findById(cartDtoInput.getProductId());
        Optional<User> user = userRepoo.findById(cartDtoInput.getUserId());

        if (product.isPresent() && user.isPresent()) {
            return cartRepo.save(Cart.builder()
                .product(product.get())
                .user(user.get())
                .qty(cartDtoInput.getQty())
                .build());
        }
        return null;
    }

    @Override
    public List<CartDtoOutput> getAll() {

        List<Cart> cartList = cartRepo.findAll();
        List<CartDtoOutput> cartDtoOutputList = new ArrayList<>();

        cartList.stream().map(cart -> {
            return cartDtoOutputList.add(
                CartDtoOutput.builder()
                    .id(cart.getId())
                    .productName(cart.getProduct().getName())
                    .qty(cart.getQty())
                    .price(cart.getProduct().getPrice())
                    .build()
            );
        });
        return cartDtoOutputList;
    }


    @Override
    public CartDtoOutput getCartById(Long id) {

//        Optional<Cart> cart = cartRepo.findById(id);
//
//        if(cart.isPresent()){
//            return CartDtoOutput.builder()
//                .id(cart.get().getId())
//                .productName(cart.get().getProduct().getName())
//                .
//
//                .build();
//        }


        return null;
    }
}