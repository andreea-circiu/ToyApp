package ro.toyapp.frontend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class DealerDTO {
	private String dealer_code;
	private String password;
	
	
	
	public String getDealer_code() {
		return dealer_code;
	}



	public void setDealer_code(String dealer_code) {
		this.dealer_code = dealer_code;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Dealer code: " + dealer_code + " || Password: " + password;
	}
	
	
	
}
