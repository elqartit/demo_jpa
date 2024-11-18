package ci.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.jpa.demo.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
//Les méthodes CRUD sont fournies par JpaRepository

}
