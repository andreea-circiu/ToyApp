package ro.toyapp.frontend.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ro.toyapp.frontend.model.DealerDTO;

@Service
@Component
public class ApiCallsUtil {
	private RestTemplate restTemplate;
	private static final String urlApi="http://localhost:8080/api/";
	@Autowired
	public ApiCallsUtil(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
		
	}
	public List<DealerDTO> getDealers() {
		RestTemplate restTemplate = new RestTemplate();
		DealerDTO dealers[] = restTemplate.getForObject(urlApi+ "dealers", DealerDTO[].class);
		List<DealerDTO> dealerList = new ArrayList<>();
		for (DealerDTO dealerDTO : dealers) {
			dealerList.add(dealerDTO);
		}
		return dealerList;
	}
	
	public String login(String dealerCode, String password) {
		RestTemplate restTemplate = new RestTemplate();
		String response= restTemplate.getForObject(urlApi + "login" + "?dealerCode=" + dealerCode + "&password=" + password , String.class);
		return response;
	}
}
