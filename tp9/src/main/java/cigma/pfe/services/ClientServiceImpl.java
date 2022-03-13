package cigma.pfe.services;

import cigma.pfe.dao.IClientDao;
import cigma.pfe.models.Client;

public class ClientServiceImpl implements IClientService {

	IClientDao iclientdao;

	@Override
	public void save(Client client) {


		iclientdao.save(client);
	}

	public ClientServiceImpl(IClientDao iclientdao) {
		this.iclientdao = iclientdao;
	}

	public ClientServiceImpl() {
	}

	

	@Override
	public void delete(Client client) {
		iclientdao.delete(client);
		
	}
	

	@Override
	public Client trouver(int num) {
		return iclientdao.trouver(num);
	}

	@Override
	public Client modifier(Client client) {
		return iclientdao.modifier(client);
	}
	

}
