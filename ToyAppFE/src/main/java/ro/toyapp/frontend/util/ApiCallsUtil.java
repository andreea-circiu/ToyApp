package ro.toyapp.frontend.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.client.RestTemplate;

import ro.toyapp.frontend.model.DealerDTO;

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
