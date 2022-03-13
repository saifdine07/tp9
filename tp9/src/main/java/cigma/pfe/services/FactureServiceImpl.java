package cigma.pfe.services;

import cigma.pfe.dao.IFactureDao;
import cigma.pfe.models.Facture;

public class FactureServiceImpl implements IFactureService {

	IFactureDao ifacturedao;
	@Override
	public void save(Facture facture) {
		// TODO Auto-generated method stub
		ifacturedao.save(facture);
		
	}
	public FactureServiceImpl(IFactureDao ifacturedao) {
		this.ifacturedao = ifacturedao;
	}
	public FactureServiceImpl() {
	}
	@Override
	public void delete(Facture facture) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Facture modifier(Facture facture) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Facture trouver(Facture facture) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
