package ro.toyapp.backend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ro.toyapp.backend.domain.Dealer;
import ro.toyapp.backend.repository.DealerRepository;


@Service
public class DealerService {
	private DealerRepository dealerRepository;
	
	public DealerService(DealerRepository dealerRepository) {
		this.dealerRepository=dealerRepository;
	}
	
	public List<Dealer> getAll(){
		return dealerRepository.findAll();
	}
}
