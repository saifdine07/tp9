package cigma.pfe.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cigma.pfe.models.Promotion;

public class PromotionDaoImpl implements IPromotionDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_mcd");
	EntityManager em = emf.createEntityManager();

	@Override
	public void save(Promotion promotion) {

		em.getTransaction().begin();
		em.persist(promotion);
		em.getTransaction().commit();
	}

	@Override
	public void delete(Promotion promotion) {

		Promotion promotiondelete = em.find(Promotion.class, promotion.getNum());
		if(promotiondelete != null) {
			em.getTransaction().begin();
			em.remove(promotiondelete);
			em.getTransaction().commit();
		}
	}

	@Override
	public Promotion modifier(Promotion promotion) {
		Promotion promotionmodifier = em.find(Promotion.class, promotion.getNum());
		if(promotionmodifier != null) {
			promotionmodifier.setDesc(promotion.getDesc());
			promotionmodifier.setClientpromotion(promotion.getClientpromotion());
			em.getTransaction().begin();
			em.persist(promotionmodifier);
			em.getTransaction().commit();
		}
		return null;
	}

	@Override
	public Promotion trouver(Promotion promotion) {
		Promotion promotiontrouver = em.find(Promotion.class, promotion.getNum());
		if(promotiontrouver != null) {
			return promotiontrouver;
		}
		
		
		return null;
	}

}
