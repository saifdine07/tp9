package cigma.pfe.controllers;

import cigma.pfe.models.Produit;
import cigma.pfe.services.IProduitService;

public class ProduitController {

	IProduitService iproduitservice;
	
	public void save(Produit produit) {
		iproduitservice.save(produit);
	}
	
	public void delete(Produit produit) {
		iproduitservice.delete(produit);
	}
	
	public Produit modifier(Produit produit) {
		return iproduitservice.modifier(produit);
	}
	
	public Produit trouver(Produit produit) {
		return iproduitservice.trouver(produit);
	}

	public ProduitController(IProduitService iproduitservice) {
		this.iproduitservice = iproduitservice;
	}

	public ProduitController() {
		super();
	}
}
