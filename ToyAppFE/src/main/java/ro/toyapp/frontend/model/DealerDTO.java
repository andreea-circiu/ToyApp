package ro.toyapp.frontend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DealerDTO {
	private String dealerCode;
	private String password;

	@Override
	public String toString() {
		return "Dealer code: " + dealerCode + " || Password: " + password;
	}
	
}
