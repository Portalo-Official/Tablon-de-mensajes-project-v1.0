package com.portalo.tablonmensajes.model.validation.domain;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ReferenciaDomainValidator implements ConstraintValidator<ReferenciaDomain, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
