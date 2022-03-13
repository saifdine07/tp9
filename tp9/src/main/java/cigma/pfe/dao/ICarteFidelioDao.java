package cigma.pfe.dao;

import cigma.pfe.models.CarteFidelio;

public interface ICarteFidelioDao {
	
	public void save(CarteFidelio cartefidelio);
	
	public void delete(CarteFidelio cartefidelio);
	
	public CarteFidelio modifier(CarteFidelio cartefidelio);
	
	public CarteFidelio trouver(CarteFidelio cartefidelio);

}
