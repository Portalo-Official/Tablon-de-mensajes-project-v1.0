package com.portalo.tablonmensajes.model.validation.domain;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = { ReferenciaDomainValidator.class })
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ReferenciaDomain {

	String message() default "La categoría es inválida";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
