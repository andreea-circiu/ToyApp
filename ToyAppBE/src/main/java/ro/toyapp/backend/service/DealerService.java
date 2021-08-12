package ro.toyapp.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ro.toyapp.backend.domain.Dealer;
import ro.toyapp.backend.repository.DealerRepository;


@Service
@Transactional
public class DealerService {
	private DealerRepository dealerRepository;
	public List<Dealer> getAll(){
        List<Dealer> dealers = new ArrayList<>();
        dealerRepository.findAll().forEach(dealers::add);
        return dealers;
    }


}
