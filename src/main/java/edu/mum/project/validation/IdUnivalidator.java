package edu.mum.project.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdUnivalidator implements ConstraintValidator<IdUni, Long>{

	@Override
	public void initialize(IdUni arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(Long arg0, ConstraintValidatorContext arg1) {
		if(arg0==null)
		    return false;
		else
			return true;
	}

}
