package validator;

import javax.inject.Inject;

import model.KnowledgeBase;

public class Validator {

	private EntityValidator entityValidator;
	
	private IntentionEntityValidator intentionEntityValidator;
	
	@Inject
	public Validator() {
		this.entityValidator = new EntityValidator();
		this.intentionEntityValidator = new IntentionEntityValidator();
	}
	
	public boolean validate(KnowledgeBase kb) {
		
		boolean entityValid = entityValidator.validate(kb);
		
		boolean intentionEntityValid = intentionEntityValidator.validate(kb);
		
		return (entityValid == true && intentionEntityValid == true);
		
	}
	

}
