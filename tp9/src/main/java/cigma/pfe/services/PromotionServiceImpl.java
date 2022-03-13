package cigma.pfe.services;

import cigma.pfe.dao.IPromotionDao;
import cigma.pfe.models.Promotion;

public class PromotionServiceImpl implements IPromotionService {
	
	IPromotionDao ipromotiondao;

	@Override
	public void save(Promotion promotion) {
		// TODO Auto-generated method stub
		ipromotiondao.save(promotion);
		
	}

	public PromotionServiceImpl(IPromotionDao ipromotiondao) {
		this.ipromotiondao = ipromotiondao;
	}

	public PromotionServiceImpl() {
	}

	@Override
	public void delete(Promotion promotion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Promotion modifier(Promotion promotion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Promotion trouver(Promotion promotion) {
		// TODO Auto-generated method stub
		return null;
	}

}
