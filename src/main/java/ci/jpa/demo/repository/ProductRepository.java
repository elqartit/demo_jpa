package ci.jpa.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ci.jpa.demo.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Les méthodes CRUD sont fournies par JpaRepository

    List<Product> findByPriceGreaterThan(double price);

    @Query("SELECT p FROM Product p WHERE p.price >: price")
    List<Product> findExpensiveProducts(@Param("price") double price);

}
