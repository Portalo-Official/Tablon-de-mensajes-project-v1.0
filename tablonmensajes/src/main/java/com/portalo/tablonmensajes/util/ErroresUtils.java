package com.portalo.tablonmensajes.util;

import com.portalo.tablonmensajes.model.validation.ErrorValidacion;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ErroresUtils {

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
	}
}
