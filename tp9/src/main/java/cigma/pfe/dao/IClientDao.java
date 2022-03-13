package cigma.pfe.dao;

import cigma.pfe.models.Client;

public interface IClientDao {
	
	public void delete(Client client);

	public void save(Client client);
	
	public Client modifier(Client client);
	
	public Client trouver(int num);

}
