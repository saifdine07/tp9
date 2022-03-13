package cigma.pfe.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;





@Entity
public class Client {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	private String nom;
	private String prenom;
	private Date ddn;
	private String tel;
	private String genre;
	private String adresse;
	
	
	
	public Client(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Client [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", ddn=" + ddn + ", tel=" + tel
				+ ", genre=" + genre + ", adresse=" + adresse + ", factureClient=" + factureClient + ", cartefidelio="
				+ cartefidelio + ", promotionclient=" + promotionclient + "]";
	}
	@OneToMany
	(cascade = CascadeType.ALL, mappedBy = "clientfacture")
	private List<Facture> factureClient; 
	
	@OneToOne
	(cascade = CascadeType.ALL, mappedBy = "clientcartefidelio")
	private CarteFidelio cartefidelio;
	
	@ManyToMany
	(cascade = CascadeType.ALL, mappedBy = "clientpromotion")
	List<Promotion> promotionclient;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Client(int num, String nom, String prenom, Date ddn, String tel, String genre, String adresse,
			List<Facture> factureClient, CarteFidelio cartefidelio, List<Promotion> promotionclient) {
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.ddn = ddn;
		this.tel = tel;
		this.genre = genre;
		this.adresse = adresse;
		this.factureClient = factureClient;
		this.cartefidelio = cartefidelio;
		this.promotionclient = promotionclient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDdn() {
		return ddn;
	}
	public void setDdn(Date ddn) {
		this.ddn = ddn;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public CarteFidelio getCartefidelio() {
		return cartefidelio;
	}
	public void setCartefidelio(CarteFidelio cartefidelio) {
		this.cartefidelio = cartefidelio;
	}
	public Client( String nom, String prenom, Date ddn, String tel, String genre, String adresse,
			List<Facture> factureClient, CarteFidelio cartefidelio, List<Promotion> promotionclient) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.ddn = ddn;
		this.tel = tel;
		this.genre = genre;
		this.adresse = adresse;
		this.factureClient = factureClient;
		this.cartefidelio = cartefidelio;
		this.promotionclient = promotionclient;
	}
	public Client() {
	} 
	
	

}
