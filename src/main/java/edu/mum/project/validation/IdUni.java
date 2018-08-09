package edu.mum.project.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MinSizeValidator.class)
public @interface IdUni {
	String message() default "The comment Id cannot same.";

	Class<?>[] groups() default {};

	public abstract Class<? extends Payload>[] payload() default {};


}
