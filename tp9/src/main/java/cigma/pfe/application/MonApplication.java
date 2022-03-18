package cigma.pfe.application;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.CarteFidelioController;
import cigma.pfe.controllers.ClientController;
import cigma.pfe.controllers.FactureController;
import cigma.pfe.controllers.ProduitController;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.Produit;
import cigma.pfe.models.Promotion;

public class MonApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//ClientController ctrl = (ClientController) context.getBean("idControllerClient");
		
		//FactureController ctrlf = (FactureController) context.getBean("idControllerFacture");
		
		ProduitController ctrlp = (ProduitController) context.getBean("idControllerProduit");
		
		/*List<Produit> listproduit = Arrays.asList(new Produit("designation", 100, 50, null), new Produit("designation1", 200, 60, null));
		
		List<Facture> listfacture = Arrays.asList(new Facture(new Date(), null, listproduit));
		
		List<Promotion> listpromotion = Arrays.asList(new Promotion("description", null));
		
		CarteFidelio cartefidelio = new CarteFidelio("000", null);
		
		
		Client client1 = new Client("saif", "hd", new Date(), "tel", "M", "adresse", listfacture, cartefidelio, listpromotion);
		
		//Client client2 = new Client(null, null, null, null, null, null, listfacture, null, listpromotion);
		
		ctrl.save(client1);
		
		List<Produit> listproduit = Arrays.asList(new Produit("designation", 100, 50, null), new Produit("designation1", 200, 60, null));
		
		List<Facture> listfacture = Arrays.asList(new Facture(new Date(), null, listproduit));
		
		List<Promotion> listpromotion = Arrays.asList(new Promotion("description", null));
		
		CarteFidelio cartefidelio = new CarteFidelio("000", null);
		
		Client client1 = new Client(2 ,"ziyad", "hd", new Date(), "tel", "M", "adresse", listfacture, cartefidelio, listpromotion);
		
		ctrl.modifier(client1);
		//ctrl.trouver(1);
		
		//ctrl.delete(cli);*/
		
		//Facture facture = new Facture(null, null, null);
		
		//ctrlf.save(facture);
		
		
		//List<Produit> listproduit = Arrays.asList(new Produit("designation", 100, 50, null), new Produit("designation1", 200, 60, null));
		
		//List<Facture> listfacture = Arrays.asList(new Facture(new Date(), null, listproduit));
		
		//Produit produit = new Produit("designation", 0, 0, listfacture);
		
		//ctrlp.save(produit);
		
		Produit p = new Produit(5);
		
		ctrlp.delete(p);
		
	}

}
