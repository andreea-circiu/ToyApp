package ro.toyapp.backend.domain;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "dealer")
public class Dealer {
	@Id
	@Column(name="dealer_code")
    private String dealerCode;
	
    private String password;
}
