package 강사님수업연습코드.product.dto.response;

import 강사님수업연습코드.product.model.ProdcutImg;
import 강사님수업연습코드.product.model.ProductDetailImg;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailOutputDto {

    private Long id;
    private String name;
    private int price;
    private String titleImgUrl;
    private String titleImgTxt;
    private String des;
    private String made;
    List<ProdcutImg> productImgList;
    List<ProductDetailImg> productDetailImgList;


    private int categoryTopId;
    private int categoryMiddelId;
    private int categorySmallId;


}
