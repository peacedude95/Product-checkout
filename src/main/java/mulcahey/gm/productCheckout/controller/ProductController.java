package mulcahey.gm.productCheckout.controller;

import mulcahey.gm.productCheckout.Model.ProductDto;
import mulcahey.gm.productCheckout.service.ProductListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductListService productListService;

    public ProductController(ProductListService productListService) {
        this.productListService = productListService;
    }
    @GetMapping(value = "/products")
    public List<ProductDto> products(){
        return productListService.process();
    }

}
