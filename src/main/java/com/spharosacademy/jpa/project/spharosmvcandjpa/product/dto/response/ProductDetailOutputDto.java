package com.spharosacademy.jpa.project.spharosmvcandjpa.product.dto.response;

import com.spharosacademy.jpa.project.spharosmvcandjpa.product.model.ProdcutImg;
import com.spharosacademy.jpa.project.spharosmvcandjpa.product.model.ProductDetailImg;
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
    private String des;
    private String made;
    List<ProdcutImg> productImgList;
    List<ProductDetailImg> productDetailImgList;
    private int categoryTopId;
    private int categoryMiddelId;
    private int categorySmallId;


}
