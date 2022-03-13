package cigma.pfe.services;

import cigma.pfe.models.Facture;

public interface IFactureService {
	
	public void save(Facture facture);
	
	public void delete(Facture facture);
	
	public Facture modifier(Facture facture);
	
	public Facture trouver(Facture facture);

}
