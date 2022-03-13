package cigma.pfe.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CarteFidelio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	private String code;
	
	
	
	public CarteFidelio() {
	}
	
	public CarteFidelio(String code, Client clientcartefidelio) {
		this.code = code;
		this.clientcartefidelio = clientcartefidelio;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_client_cartefidelio")
	private Client clientcartefidelio;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Client getClient() {
		return clientcartefidelio;
	}
	public void setClient(Client client) {
		this.clientcartefidelio = client;
	}

}
