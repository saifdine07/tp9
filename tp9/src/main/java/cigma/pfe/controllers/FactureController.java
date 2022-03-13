package cigma.pfe.controllers;

import cigma.pfe.models.Facture;
import cigma.pfe.services.IFactureService;

public class FactureController {
	
	IFactureService ifactureservice;
	
	public void save(Facture facture) {
		ifactureservice.save(facture);
	}
	
	public void delete(Facture facture) {
		ifactureservice.delete(facture);
	}
	
	public Facture modifier(Facture facture) {
		return ifactureservice.modifier(facture);
	}
	
	public Facture trouver(Facture facture) {
		return ifactureservice.trouver(facture);
	}

	public FactureController() {
	}

	public FactureController(IFactureService ifactureservice) {
		this.ifactureservice = ifactureservice;
	}

}
