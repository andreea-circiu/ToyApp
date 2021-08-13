package ro.toyapp.backend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.joran.conditional.IfAction;
import ro.toyapp.backend.domain.Dealer;
import ro.toyapp.backend.repository.DealerRepository;


@Service
public class DealerService {
	private DealerRepository dealerRepository;
	
	@Autowired
	public DealerService(DealerRepository dealerRepository) {
		this.dealerRepository=dealerRepository;
	}
	
	public List<Dealer> getAll(){
		return dealerRepository.findAll();
	}
	
	public String checkCredentials(String dealerCode, String password) {
		boolean dealerExist =  dealerRepository.checkIfDealerExist(dealerCode, password);
		if (dealerExist) {
			return dealerCode;
		} else {
			return null;
		}
	}
}
