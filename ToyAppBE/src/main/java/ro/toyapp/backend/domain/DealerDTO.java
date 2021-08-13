package ro.toyapp.backend.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class DealerDTO {
	private String dealerCode;
	private String password;
}
