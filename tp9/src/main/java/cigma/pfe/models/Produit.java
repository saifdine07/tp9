package cigma.pfe.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;


@Entity
public class Produit {
	
	@Override
	public String toString() {
		return "Produit [num=" + num + ", designation=" + designation + ", prix=" + prix + ", stock=" + stock
				+ ", factureproduit=" + factureproduit + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	private String designation;
	private float prix;
	private int stock;
	
	public Produit(int num) {
		this.num = num;
	}
	public Produit() {
	}
	public Produit(String designation, float prix, int stock, List<Facture> factureproduit) {
		this.designation = designation;
		this.prix = prix;
		this.stock = stock;
		this.factureproduit = factureproduit;
	}
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_facture_produit")
	private List<Facture> factureproduit;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public List<Facture> getFactureproduit() {
		return factureproduit;
	}
	public void setFactureproduit(List<Facture> factureproduit) {
		this.factureproduit = factureproduit;
	}

}
