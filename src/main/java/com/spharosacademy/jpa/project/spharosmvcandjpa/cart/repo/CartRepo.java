package com.spharosacademy.jpa.project.spharosmvcandjpa.cart.repo;

import com.spharosacademy.jpa.project.spharosmvcandjpa.cart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, Long> {
}
