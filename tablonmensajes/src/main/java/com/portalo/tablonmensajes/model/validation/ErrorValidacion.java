package com.portalo.tablonmensajes.model.validation;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorValidacion {
	private String codigo;
	private String descripcion;
}
