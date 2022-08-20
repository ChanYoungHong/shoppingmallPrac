package 강사님수업연습코드.product.service;

import 강사님수업연습코드.product.model.ProductDetailImg;
import java.util.List;

public interface ProductDetailImgService {

    List<ProductDetailImg> getAllByProductId(Long productId);

}
