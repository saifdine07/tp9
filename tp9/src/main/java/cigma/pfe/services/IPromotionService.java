package cigma.pfe.services;

import cigma.pfe.models.Promotion;

public interface IPromotionService {
	
	public void save(Promotion promotion);
	
	public void delete(Promotion promotion);
	
	public Promotion modifier(Promotion promotion);
	
	public Promotion trouver(Promotion promotion);

}
