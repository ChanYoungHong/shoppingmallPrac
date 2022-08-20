package 강사님수업연습코드.product.service.Impl;

import 강사님수업연습코드.product.model.ProductDetailImg;
import 강사님수업연습코드.product.repo.ProductDetailImgeRepo;
import 강사님수업연습코드.product.service.ProductDetailImgService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdcutDetailImlServiceImpl implements ProductDetailImgService {

    private final ProductDetailImgeRepo productDetailImgeRepo;

    @Override
    public List<ProductDetailImg> getAllByProductId(Long productId) {
        return productDetailImgeRepo.findAllByProductId(productId);
    }

}
