package cigma.pfe.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import cigma.pfe.models.Client;

public class ClientDaoImpl implements IClientDao{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_mcd");
	EntityManager em = emf.createEntityManager();

	public void save(Client client) {

		em.getTransaction().begin();
		em.persist(client);
		em.getTransaction().commit();
		
	}

	
	@Override
	public Client trouver(int num) {
		Client clientTrouver = em.find(Client.class, num);
		if(clientTrouver != null) {
			System.out.println(clientTrouver);
			return clientTrouver;
		}
		else {
			return null;
		}
		
	}


	@Override
	public void delete(Client client) {

		Client clientdelete = trouver(client.getNum());
		if(clientdelete != null) {
			em.getTransaction().begin();
			em.remove(clientdelete);
			em.getTransaction().commit();
		}
	}


	@Override
	public Client modifier(Client client) {
		Client clientmodifier = trouver(client.getNum());
		if(clientmodifier != null) {
			clientmodifier.setNom(client.getNom());
			clientmodifier.setPrenom(client.getPrenom());
			clientmodifier.setDdn(client.getDdn());
			clientmodifier.setTel(client.getTel());
			clientmodifier.setGenre(client.getGenre());
			clientmodifier.setAdresse(client.getAdresse());
			clientmodifier.setCartefidelio(client.getCartefidelio());
			em.getTransaction().begin();
			em.persist(clientmodifier);
			em.getTransaction().commit();
			System.out.println(clientmodifier);
		}
		
			return null;
		
	}

}
