package ro.toyapp.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ro.toyapp.backend.domain.Dealer;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, String>{

}
