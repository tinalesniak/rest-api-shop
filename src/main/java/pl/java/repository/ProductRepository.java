package pl.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.java.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
