package mulcahey.gm.productCheckout.db.repositories;

import jakarta.persistence.Column;
import mulcahey.gm.productCheckout.db.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository  extends CrudRepository<Product, Long> {

}
