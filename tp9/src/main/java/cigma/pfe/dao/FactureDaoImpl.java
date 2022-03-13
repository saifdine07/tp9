package cigma.pfe.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cigma.pfe.models.Facture;

public class FactureDaoImpl implements IFactureDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_mcd");
	EntityManager em = emf.createEntityManager();

	public void save(Facture facture) {
		em.getTransaction().begin();
		em.persist(facture);
		em.getTransaction().commit();
		
	}

	@Override
	public void delete(Facture facture) {
		Facture facturedelete = em.find(Facture.class, facture.getNum());
		if(facturedelete != null) {
			em.getTransaction().begin();
			em.remove(facturedelete);
			em.getTransaction().commit();
		}
		
	}

	@Override
	public Facture trouver(Facture facture) {
		Facture facturetrouver = em.find(Facture.class, facture.getNum());
		if (facturetrouver != null) {
			System.out.println(facturetrouver);
			return facturetrouver;
			
		}
		return null;
	}

	@Override
	public Facture modifier(Facture facture) {
		Facture facturemodifier = em.find(Facture.class, facture.getNum());
		if(facturemodifier != null) {
			facturemodifier.setDate(facture.getDate());
			facturemodifier.setClientfacture(facture.getClientfacture());
			facturemodifier.setProduitfacture(facture.getProduitfacture());
			em.getTransaction().begin();
			em.persist(facturemodifier);
			em.getTransaction().commit();
		}
		return null;
	}

}
