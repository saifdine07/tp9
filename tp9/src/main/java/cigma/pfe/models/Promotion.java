package cigma.pfe.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Promotion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int num;
	private String description;
	
	
	public Promotion() {
	}
	
	public Promotion(String description, List<Client> clientpromotion) {
		this.description = description;
		this.clientpromotion = clientpromotion;
	}
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_client_promotion")
	private List<Client> clientpromotion;
	
	public List<Client> getClientpromotion() {
		return clientpromotion;
	}
	public void setClientpromotion(List<Client> clientpromotion) {
		this.clientpromotion = clientpromotion;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}

}
