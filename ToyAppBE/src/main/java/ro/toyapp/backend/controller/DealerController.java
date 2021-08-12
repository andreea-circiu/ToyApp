package ro.toyapp.backend.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.NoArgsConstructor;
import ro.toyapp.backend.domain.Dealer;
import ro.toyapp.backend.repository.DealerRepository;

@RestController
@RequestMapping(path="api")
@NoArgsConstructor
public class DealerController {
	@Autowired
	private DealerRepository dealerRepository;
	
	@GetMapping("dealers")
    List<Dealer> all() {
        return dealerRepository.findAll();
    }

}
