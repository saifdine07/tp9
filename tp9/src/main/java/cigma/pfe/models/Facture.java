package cigma.pfe.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Facture {
	
	@Override
	public String toString() {
		return "Facture [num=" + num + ", date=" + date + ", clientfacture=" + clientfacture + ", produitfacture="
				+ produitfacture + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	private Date date;
	
	
	
	
	public Facture() {
	}
	public Facture(Date date, Client clientfacture, List<Produit> produitfacture) {
		this.date = date;
		this.clientfacture = clientfacture;
		this.produitfacture = produitfacture;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_client_facture")
	private Client clientfacture;
	
	@ManyToMany
	(cascade = CascadeType.ALL, mappedBy = "factureproduit")
	private List<Produit> produitfacture;
	
	public Client getClientfacture() {
		return clientfacture;
	}
	public void setClientfacture(Client clientfacture) {
		this.clientfacture = clientfacture;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Produit> getProduitfacture() {
		return produitfacture;
	}
	public void setProduitfacture(List<Produit> produitfacture) {
		this.produitfacture = produitfacture;
	}

}
