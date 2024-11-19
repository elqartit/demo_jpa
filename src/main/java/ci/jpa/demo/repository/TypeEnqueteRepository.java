package ci.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.jpa.demo.domain.TypeEnquete;

public interface TypeEnqueteRepository extends JpaRepository<TypeEnquete, Integer> {
    // Les méthodes CRUD sont fournies par JpaRepository

}
