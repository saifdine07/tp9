package cigma.pfe.services;

import cigma.pfe.dao.IProduitDao;
import cigma.pfe.models.Produit;

public class ProduitServiceImpl implements IProduitService{
	
	IProduitDao iproduitdao;

	public void save(Produit produit) {
		// TODO Auto-generated method stub
		iproduitdao.save(produit);
		
		
	}

	public ProduitServiceImpl(IProduitDao iproduitdao) {
		this.iproduitdao = iproduitdao;
	}

	public ProduitServiceImpl() {
	}

	@Override
	public void delete(Produit produit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produit modifier(Produit produit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit trouver(Produit produit) {
		// TODO Auto-generated method stub
		return null;
	}

}
