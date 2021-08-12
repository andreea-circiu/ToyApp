package ro.toyapp.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.NoArgsConstructor;
import ro.toyapp.backend.domain.Dealer;
import ro.toyapp.backend.repository.DealerRepository;
import ro.toyapp.backend.service.DealerService;

@RestController
@RequestMapping(path="api")
@NoArgsConstructor
public class DealerController {
	@Autowired
	private DealerService dealerService;
	
//	@GetMapping("/dealers")
// 	public List<Dealer> get(){
//		List<Dealer> dealers;
//		dealers = (List<Dealer>) dealerRepository.findAll();
//		return dealers;
// 	}
	
	@GetMapping("/dealers")
    public ResponseEntity getAll() { return ResponseEntity.ok(dealerService.getAll());}

}
