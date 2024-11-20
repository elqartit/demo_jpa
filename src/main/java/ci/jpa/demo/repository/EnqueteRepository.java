package ci.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.jpa.demo.domain.Enquete;

public interface EnqueteRepository extends JpaRepository<Enquete, Long> {

}
