package ci.jpa.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.jpa.demo.domain.Enquete;

public interface EnqueteRepository extends JpaRepository<Enquete, Integer> {
    // Les méthodes CRUD sont fournies par JpaRepository
}
