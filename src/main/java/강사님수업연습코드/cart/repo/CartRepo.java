package 강사님수업연습코드.cart.repo;

import 강사님수업연습코드.cart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, Long> {
}
