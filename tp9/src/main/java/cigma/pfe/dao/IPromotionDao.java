package cigma.pfe.dao;

import cigma.pfe.models.Promotion;

public interface IPromotionDao {
	
	public void save(Promotion promotion);
	
	public void delete(Promotion promotion);
	
	public Promotion modifier(Promotion promotion);
	
	public Promotion trouver(Promotion promotion);

}
