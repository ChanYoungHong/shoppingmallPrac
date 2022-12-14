package 강사님수업연습코드.product.repo;

import 강사님수업연습코드.product.model.ProductDetailImg;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailImgeRepo extends JpaRepository<ProductDetailImg, Long> {


    List<ProductDetailImg> findAllByProductId(Long productId);


}