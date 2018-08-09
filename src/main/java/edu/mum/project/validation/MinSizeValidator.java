package edu.mum.project.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MinSizeValidator implements ConstraintValidator<MinSize, String>{

	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		if(arg0.length()<5) {			
		return false;
		}
		else
			return true;
	}

	@Override
	public void initialize(MinSize arg0) {
		// TODO Auto-generated method stub
		
	}

}
