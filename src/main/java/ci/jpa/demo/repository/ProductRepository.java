package ci.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.jpa.demo.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}