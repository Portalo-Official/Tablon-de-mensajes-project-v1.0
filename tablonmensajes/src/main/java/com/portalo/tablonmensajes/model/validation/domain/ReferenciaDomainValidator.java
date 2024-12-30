package com.portalo.tablonmensajes.model.validation.domain;

import org.springframework.validation.annotation.Validated;

import com.portalo.tablonmensajes.util.ErroresUtils.ErroresDomain;
import com.portalo.tablonmensajes.util.ErroresUtils.TipoErrores;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ReferenciaDomainValidator implements ConstraintValidator<ReferenciaDomain, String>{
	
	
	
	@Override
	public void initialize(ReferenciaDomain constraintAnnotation) {
		
	}

	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean valid = true;
		context.disableDefaultConstraintViolation();
		if(!value.startsWith("0x") ) {
			context.buildConstraintViolationWithTemplate(ErroresDomain.ID_POST.getCodigo())
					.addPropertyNode(TipoErrores.DOMAIN.name())
					.addConstraintViolation();
			
			valid = false;
		}
		
		
		return valid;
	}

}
