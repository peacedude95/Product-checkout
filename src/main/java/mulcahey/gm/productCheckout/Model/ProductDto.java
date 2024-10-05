package mulcahey.gm.productCheckout.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import mulcahey.gm.productCheckout.db.entities.Product;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class ProductDto {
    @JsonProperty
    private String productId;
    @JsonProperty
    private String productName;
    @JsonProperty
    private BigDecimal productPrice;
    @JsonProperty
    private Date addedAT;
    @JsonProperty()
    String[] labels;
    public ProductDto() {}
    public static ProductDto getProductDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setProductId(productDto.getProductId());
        productDto.setProductName(product.getName());
        productDto.setProductPrice(product.getPrice());
        productDto.setAddedAT(product.getAdded_at());
        return productDto;
    }
}
