package 강사님수업연습코드.cart.service;

import 강사님수업연습코드.cart.cartdto.request.CartDtoInput;
import 강사님수업연습코드.cart.cartdto.response.CartDtoOutput;
import 강사님수업연습코드.cart.model.Cart;
import 강사님수업연습코드.cart.repo.CartRepo;
import 강사님수업연습코드.product.model.Product;
import 강사님수업연습코드.product.repo.ProductRepo;
import 강사님수업연습코드.user.model.User;
import 강사님수업연습코드.user.repo.UserRepoo;
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