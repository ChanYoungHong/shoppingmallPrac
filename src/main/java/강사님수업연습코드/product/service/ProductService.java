package 강사님수업연습코드.product.service;

import 강사님수업연습코드.product.dto.response.ProductDetailOutputDto;
import 강사님수업연습코드.product.model.Product;

public interface ProductService {

    ProductDetailOutputDto getProduct(Long id);

    Product addProduct(ProductDetailOutputDto productDetailOutputDto);

}
