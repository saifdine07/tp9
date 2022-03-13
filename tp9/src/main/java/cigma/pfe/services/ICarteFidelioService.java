package cigma.pfe.services;

import cigma.pfe.models.CarteFidelio;

public interface ICarteFidelioService {
	
	public void save(CarteFidelio cartefidelio);
	
	public void delete(CarteFidelio cartefidelio);
	
	public CarteFidelio modifier(CarteFidelio cartefidelio);
	
	public CarteFidelio trouver(CarteFidelio cartefidelio);

}
