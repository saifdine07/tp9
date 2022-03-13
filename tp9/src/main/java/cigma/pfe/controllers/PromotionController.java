package cigma.pfe.controllers;

import cigma.pfe.models.Promotion;
import cigma.pfe.services.IPromotionService;

public class PromotionController {
	
	IPromotionService ipromotionservice;
	
	public void save(Promotion promotion) {
		ipromotionservice.save(promotion);
	}
	
	public void delete(Promotion promotion) {
		ipromotionservice.delete(promotion);
	}
	
	public Promotion modifier(Promotion promotion) {
		return ipromotionservice.modifier(promotion);
	}
	
	public Promotion trouve(Promotion promotion) {
		return ipromotionservice.trouver(promotion);
	}

	public PromotionController(IPromotionService ipromotionservice) {
		this.ipromotionservice = ipromotionservice;
	}

	public PromotionController() {
	}

}
