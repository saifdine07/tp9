package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;

public class ClientController {
	
	IClientService iClientService;
	
	public void save(Client client) {
		iClientService.save(client);
	}

	public void delete(Client client) {
		iClientService.delete(client);
	}
	
	public Client modifier(Client client) {
		return iClientService.modifier(client);
		
	}
	
	public Client trouver(int num) {
		return iClientService.trouver(num);
		
	}
	public ClientController() {
	}

	public ClientController(IClientService iClientService) {
		this.iClientService = iClientService;
	}

}
