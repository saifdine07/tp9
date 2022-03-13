package cigma.pfe.dao;

import cigma.pfe.models.Facture;

public interface IFactureDao {
	
	public void save(Facture facture);
	
	public void delete(Facture facture);
	
	public Facture trouver(Facture facture);
	
	public Facture modifier(Facture facture);

}
