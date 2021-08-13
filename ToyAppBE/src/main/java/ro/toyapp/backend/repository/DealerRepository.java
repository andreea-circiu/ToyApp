package ro.toyapp.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ro.toyapp.backend.domain.Dealer;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, String>{

	
	@Query(
			value = "SELECT EXIST(SELECT 1 FROM dealer where dealer_code = ?1 AND password = ?2)", 
			nativeQuery = true)
    boolean checkIfDealerExist(String dealerCode, String password);
}
