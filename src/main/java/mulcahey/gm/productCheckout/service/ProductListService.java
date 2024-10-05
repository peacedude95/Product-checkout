package mulcahey.gm.productCheckout.service;

import mulcahey.gm.productCheckout.Model.ProductDto;
import mulcahey.gm.productCheckout.db.entities.Product;
import mulcahey.gm.productCheckout.db.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductListService {
    private ProductRepository productRepository;

    private ProductListService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

public List<ProductDto> process () {
        List<ProductDto> productDtos = new ArrayList<>();

        for (Product product : productRepository.findAll()) {
            productDtos.add(ProductDto.getProductDto(product));
        }
        return productDtos;
}
}
