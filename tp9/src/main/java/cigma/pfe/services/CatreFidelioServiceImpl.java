package cigma.pfe.services;

import cigma.pfe.dao.ICarteFidelioDao;
import cigma.pfe.models.CarteFidelio;

public class CatreFidelioServiceImpl implements ICarteFidelioService {
	
	ICarteFidelioDao icartefideliodao;

	@Override
	public void save(CarteFidelio cartefidelio) {
		// TODO Auto-generated method stub
		icartefideliodao.save(cartefidelio);
		
	}

	public CatreFidelioServiceImpl(ICarteFidelioDao icartefideliodao) {
		this.icartefideliodao = icartefideliodao;
	}

	public CatreFidelioServiceImpl() {
	}

	@Override
	public void delete(CarteFidelio cartefidelio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CarteFidelio modifier(CarteFidelio cartefidelio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarteFidelio trouver(CarteFidelio cartefidelio) {
		// TODO Auto-generated method stub
		return null;
	}

}
