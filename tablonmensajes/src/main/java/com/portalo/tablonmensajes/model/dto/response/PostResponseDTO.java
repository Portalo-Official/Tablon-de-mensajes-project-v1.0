package com.portalo.tablonmensajes.model.dto.response;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostResponseDTO {
	@JsonProperty("post_reference")
	private String uuid;
	@JsonProperty("title")
	private String titulo;
	@JsonProperty("body")
	private String contenido;
	@JsonProperty("publish_date")
	private LocalDate fechaPublicacion;
	@JsonProperty("usuario_resume")
	private UsuarioResumeDTO usuario;
}
