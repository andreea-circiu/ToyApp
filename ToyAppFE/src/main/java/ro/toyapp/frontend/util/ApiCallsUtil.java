package ro.toyapp.frontend.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.server.VaadinService;

import ro.toyapp.frontend.model.DealerDTO;

@Component
public class ApiCallsUtil extends UI {

	private static final String API="http://localhost:8080/api/";
	
	@Autowired
	private RestTemplate restTemplate;

		
	public List<DealerDTO> getDealers() {
		DealerDTO dealers[] = restTemplate.getForObject(API+ "dealers", DealerDTO[].class);
		List<DealerDTO> dealerList = new ArrayList<>();
		for (DealerDTO dealerDTO : dealers) {
			dealerList.add(dealerDTO);
		}
		return dealerList;
	}
	
	public String login(String dealerCode, String password) {
		String response;
		try {
			restTemplate.getForObject(API + "login" + "?dealerCode=" + dealerCode + "&password=" + password , String.class);
			VaadinService.getCurrentRequest().getWrappedSession().setAttribute("dealerCode", dealerCode);
			response = "ok";
		} catch (Exception e) {
			response = e.getMessage();
		}
		return response;
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
