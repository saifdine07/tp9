package cigma.pfe.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cigma.pfe.models.Produit;

public class ProduitDaoImpl implements IProduitDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_mcd");
	EntityManager em = emf.createEntityManager();

	@Override
	public void save(Produit produit) {

		em.getTransaction().begin();
		em.persist(produit);
		em.getTransaction().commit();
	}

	@Override
	public void delete(Produit produit) {

		Produit produitdelete = em.find(Produit.class, produit.getNum());
		if(produitdelete != null) {
			em.getTransaction().begin();
			em.remove(produitdelete);
			em.getTransaction().commit();
		}
	}

	@Override
	public Produit modifier(Produit produit) {

		Produit produitmodifier = em.find(Produit.class, produit.getNum());
		if(produitmodifier != null) {
			produitmodifier.setPrix(produit.getPrix());
			produitmodifier.setStock(produit.getStock());
			produitmodifier.setDesignation(produit.getDesignation());
			produitmodifier.setFactureproduit(produit.getFactureproduit());
		}
		return null;
	}

	@Override
	public Produit trouver(Produit produit) {

		Produit produittrouver = em.find(Produit.class, produit.getNum());
		if(produittrouver != null) {
			return produittrouver;
		}
		return null;
	}

	

}
