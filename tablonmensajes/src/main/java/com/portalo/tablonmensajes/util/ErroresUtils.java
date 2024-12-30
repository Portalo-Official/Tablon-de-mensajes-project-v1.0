package com.portalo.tablonmensajes.util;

import java.util.Arrays;
import java.util.function.Supplier;

import com.portalo.tablonmensajes.model.validation.ErrorValidacion;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ErroresUtils {
	
	public enum TipoErrores{
		MANDATORY("MANDATORY"),
		DOMAIN("DOMAIN");
		
		private String tipoError;

		private TipoErrores(String tipoError) {
			this.tipoError = tipoError;
		}
		
		public static boolean containsTipoError(String campo, TipoErrores tipoError) {
			return campo.contains(tipoError.name());
		}

		
	}
	
	public enum ErroresMandatory {
		ID_POST("EM0001", "La referencia del post es obligatoria");
		@Getter
		private String codigo;
		@Getter
		private String descripcion;
		
		private ErroresMandatory(String codigo, String descripcion) {
			this.codigo = codigo;
			this.descripcion = descripcion;
		}
		public static ErrorValidacion getErrorValidacion(ErroresMandatory error) {
			return ErrorValidacion.builder()
								.codigo(error.getCodigo())
								.descripcion(error.getDescripcion())
								.build();
		}
		
		public static ErrorValidacion parseToErrorValicacion(String mensajeError) {
			
			return Arrays.asList(ErroresMandatory.values()).stream()
													.filter(error -> mensajeError.equalsIgnoreCase(error.getCodigo()))
													.map(error ->{
														return ErrorValidacion.builder()
																.codigo(error.getCodigo())
																.descripcion(error.getDescripcion())
																.build();
													})
													.findFirst()
													.orElseThrow();
		}
	}
		
	public enum ErroresDomain{
		ID_POST("EM0001", "La referencia del post es obligatoria");
		@Getter
		private String codigo;
		@Getter
		private String descripcion;
		
		private ErroresDomain(String codigo, String descripcion) {
			this.codigo = codigo;
			this.descripcion = descripcion;
		}
		public static ErrorValidacion getErrorValidacion(ErroresDomain error) {
			return ErrorValidacion.builder()
								.codigo(error.getCodigo())
								.descripcion(error.getDescripcion())
								.build();
		}
		
		public static ErrorValidacion parseToErrorValicacion(String mensajeError) {
			return Arrays.asList(ErroresDomain.values()).stream()
															.filter(error -> mensajeError.equalsIgnoreCase(error.getCodigo()))
															.map(error ->{
																return ErrorValidacion.builder()
																		.codigo(error.getCodigo())
																		.descripcion(error.getDescripcion())
																		.build();
															})
															.findFirst()
															.orElse(null);
		}
	}
}
