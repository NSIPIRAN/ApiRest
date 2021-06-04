package pe.com.vack.ejercicio.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CIFValidator implements ConstraintValidator<CIF, String>{
	
@Override
public boolean isValid(String value, ConstraintValidatorContext context) {
	if (value == null) {
		
		return false;
	}
	
	return value.length() == 9;
	}
}