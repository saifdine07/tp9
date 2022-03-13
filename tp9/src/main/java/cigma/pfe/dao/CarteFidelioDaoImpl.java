package cigma.pfe.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cigma.pfe.models.CarteFidelio;

public class CarteFidelioDaoImpl implements ICarteFidelioDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_mcd");
	EntityManager em = emf.createEntityManager();
	@Override
	public void save(CarteFidelio cartefidelio) {

		em.getTransaction().begin();
		em.persist(cartefidelio);
		em.getTransaction().commit();
	}
	@Override
	public void delete(CarteFidelio cartefidelio) {

		CarteFidelio cartefideliodelete = em.find(CarteFidelio.class, cartefidelio.getNum());
		if(cartefidelio != null) {
			em.getTransaction().begin();
			em.remove(cartefideliodelete);
			em.getTransaction().commit();
		}
	}
	@Override
	public CarteFidelio modifier(CarteFidelio cartefidelio) {
		CarteFidelio cartefideliomodifier = em.find(CarteFidelio.class, cartefidelio.getNum());
		if(cartefideliomodifier != null) {
			cartefideliomodifier.setCode(cartefidelio.getCode());
			cartefideliomodifier.setClient(cartefidelio.getClient());
		}
		
		return null;
	}
	@Override
	public CarteFidelio trouver(CarteFidelio cartefidelio) {

		CarteFidelio cartefideliotrouver = em.find(CarteFidelio.class, cartefidelio.getNum());
		if(cartefideliotrouver != null) {
			return cartefideliotrouver;
		}
		return null;
	}

}
