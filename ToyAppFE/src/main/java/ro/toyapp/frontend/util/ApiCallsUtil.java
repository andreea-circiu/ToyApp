package ro.toyapp.frontend.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ro.toyapp.frontend.model.DealerDTO;

@Service
public class ApiCallsUtil {
	
	
	public List<DealerDTO> getDealers() {
		RestTemplate restTemplate = new RestTemplate();
		DealerDTO dealers[] = restTemplate.getForObject("http://localhost:8080/api/dealers", DealerDTO[].class);
		List<DealerDTO> dealerList = new ArrayList<>();
		for (DealerDTO dealerDTO : dealers) {
			dealerList.add(dealerDTO);
		}
		return dealerList;
	}
}
