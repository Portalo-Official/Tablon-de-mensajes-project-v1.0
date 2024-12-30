package com.portalo.tablonmensajes.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.method.ParameterValidationResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

import com.portalo.tablonmensajes.model.validation.ErrorValidacion;
import com.portalo.tablonmensajes.util.ErroresUtils.ErroresDomain;
import com.portalo.tablonmensajes.util.ErroresUtils.ErroresMandatory;
import com.portalo.tablonmensajes.util.ErroresUtils.TipoErrores;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

@ControllerAdvice
public class HandleControllerAdvice {
	/**
	 * Discrimina si el campo de errores contiene mandatory o domian para 
	 * decidir el Status Code de la respuesta Http
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleValidations(MethodArgumentNotValidException ex){
		List<ErrorValidacion> mandatoryValidaciones =  new ArrayList<>();
		List<ErrorValidacion> domainValidaciones =  new ArrayList<>();
		List<String> validacionesNoCategorizadas = new ArrayList<>();
		List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
		
		fieldErrors.forEach(fieldError -> {
			String field = fieldError.getField();
			String mensajeError = fieldError.getDefaultMessage();
			if(TipoErrores.containsTipoError(field, TipoErrores.MANDATORY)) {
				mandatoryValidaciones.add(ErroresMandatory.parseToErrorValicacion(mensajeError));
			}
			else if(TipoErrores.containsTipoError(field, TipoErrores.DOMAIN)) {
				domainValidaciones.add(ErroresDomain.parseToErrorValicacion(mensajeError));
			}
			else {
				validacionesNoCategorizadas.add(mensajeError);
			}
			
		});
		
		if(CollectionUtils.isNotEmpty(mandatoryValidaciones)) {
			return ResponseEntity.badRequest().body(mandatoryValidaciones);
		}
		else if(CollectionUtils.isNotEmpty(domainValidaciones)) {
			return ResponseEntity.unprocessableEntity().body(domainValidaciones);
			
		}
		
		return ResponseEntity.unprocessableEntity().body(validacionesNoCategorizadas);
	}
	
	/**
	 * Discrimina si el campo de errores contiene mandatory o domian para 
	 * decidir el Status Code de la respuesta Http
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<?> handleValidations(ConstraintViolationException ex){
		List<ErrorValidacion> mandatoryValidaciones =  new ArrayList<>();
		List<ErrorValidacion> domainValidaciones =  new ArrayList<>();
		List<String> validacionesNoCategorizadas = new ArrayList<>();
		
		Set<ConstraintViolation<?>> violaciones = ex.getConstraintViolations();
		
		violaciones.forEach(violacion -> {
			String ruta = violacion.getPropertyPath().toString();
			String mensajeError = violacion.getMessage();
			
			if(TipoErrores.containsTipoError(ruta, TipoErrores.MANDATORY)) {
				mandatoryValidaciones.add(ErroresMandatory.parseToErrorValicacion(mensajeError));
			}
			else if(TipoErrores.containsTipoError(ruta, TipoErrores.DOMAIN)) {
				domainValidaciones.add(ErroresDomain.parseToErrorValicacion(mensajeError));
			}
			else {
				validacionesNoCategorizadas.add(mensajeError);
			}
			
		});
		
		if(CollectionUtils.isNotEmpty(mandatoryValidaciones)) {
			return ResponseEntity.badRequest().body(mandatoryValidaciones);
		}
		else if(CollectionUtils.isNotEmpty(domainValidaciones)) {
			return ResponseEntity.unprocessableEntity().body(domainValidaciones);
		}
		
		return ResponseEntity.unprocessableEntity().body(validacionesNoCategorizadas);
	}

	@ExceptionHandler(HandlerMethodValidationException.class)
	public ResponseEntity<?> handleValidations(HandlerMethodValidationException  ex){
		List<ErrorValidacion> mandatoryValidaciones =  new ArrayList<>();
		List<ErrorValidacion> domainValidaciones =  new ArrayList<>();
		List<String> validacionesNoCategorizadas = new ArrayList<>();
		
		List<ParameterValidationResult> violaciones = ex.getAllValidationResults();
		
		
		
		violaciones.forEach(violacion -> {

			for (MessageSourceResolvable resultado : violacion.getResolvableErrors()) {
				String mensajeError = resultado.getDefaultMessage();
				
				for(String validacionTipo :resultado.getCodes())

				
				if(TipoErrores.containsTipoError(validacionTipo, TipoErrores.MANDATORY)) {
					mandatoryValidaciones.add(ErroresMandatory.parseToErrorValicacion(mensajeError));
				}
				else if(TipoErrores.containsTipoError(validacionTipo, TipoErrores.DOMAIN)) {
					domainValidaciones.add(ErroresDomain.parseToErrorValicacion(mensajeError));
				}
				else {
					validacionesNoCategorizadas.add(mensajeError);
				}
			}
			
			
		});
		
		if(CollectionUtils.isNotEmpty(mandatoryValidaciones)) {
			return ResponseEntity.badRequest().body(mandatoryValidaciones);
		}
		else if(CollectionUtils.isNotEmpty(domainValidaciones)) {
			return ResponseEntity.unprocessableEntity().body(domainValidaciones);
		}
		
		return ResponseEntity.unprocessableEntity().body(validacionesNoCategorizadas);
	}
	
	
	
}
