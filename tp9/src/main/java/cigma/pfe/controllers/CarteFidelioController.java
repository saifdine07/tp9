package cigma.pfe.controllers;

import cigma.pfe.models.CarteFidelio;
import cigma.pfe.services.ICarteFidelioService;

public class CarteFidelioController {
	
	ICarteFidelioService icartefidelioservice;
	
	public CarteFidelioController(ICarteFidelioService icartefidelioservice) {
		this.icartefidelioservice = icartefidelioservice;
	}

	public CarteFidelioController() {
	}

	public void save(CarteFidelio cartefidelio) {
		icartefidelioservice.save(cartefidelio);
	}
	
	public void delete(CarteFidelio cartefidelio) {
		icartefidelioservice.delete(cartefidelio);
	}
	
	public CarteFidelio modifier(CarteFidelio cartefidelio) {
		return icartefidelioservice.modifier(cartefidelio);
	}
	
	public CarteFidelio trouver(CarteFidelio cartefidelio) {
		return icartefidelioservice.trouver(cartefidelio);
		
	}

}
