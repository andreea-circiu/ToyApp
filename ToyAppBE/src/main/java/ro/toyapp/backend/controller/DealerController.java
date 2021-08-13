package ro.toyapp.backend.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.NoArgsConstructor;
import ro.toyapp.backend.domain.Dealer;

import ro.toyapp.backend.repository.DealerRepository;
import ro.toyapp.backend.service.DealerService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path="api")
@NoArgsConstructor
@Component
public class DealerController {
	
	private DealerService dealerService;

	@Autowired
	public DealerController(DealerService dealerService) {
		this.dealerService= dealerService;
	}
	
	@GetMapping("dealers")
    List<Dealer> getAll() {
        return dealerService.getAll();
    }
	
	@PostMapping("login")
    ResponseEntity<String> checkIfUserExists(String dealerCode, String password) {
		try{
			dealerService.checkCredentials(dealerCode, password);
			return new ResponseEntity<>(dealerCode,HttpStatus.OK);
		}catch(IllegalStateException e) {
			e.getMessage();
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
    }
	
	

}
