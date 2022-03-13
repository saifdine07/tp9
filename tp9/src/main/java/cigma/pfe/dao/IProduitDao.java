package cigma.pfe.dao;

import cigma.pfe.models.Produit;

public interface IProduitDao {
	
	public void save(Produit produit);
	
	public void delete(Produit produit);
	
	public Produit modifier(Produit produit);
	
	public Produit trouver(Produit produit);

}
