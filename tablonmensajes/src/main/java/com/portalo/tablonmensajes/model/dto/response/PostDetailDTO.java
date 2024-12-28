package com.portalo.tablonmensajes.model.dto.response;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonPropertyOrder({
	"post_reference",
    "title",
    "body",
    "publish_date",
    "user_resume",
    "categories"
})
public class PostDetailDTO {
	@JsonProperty("post_reference")
	private String uuid;
	@JsonProperty("title")
	private String titulo;
	@JsonProperty("body")
	private String contenido;
	@JsonProperty("publish_date")
	private LocalDate fechaPublicacion;
	@JsonProperty("user_resume")
	private UsuarioResumeDTO usuario;
	@JsonProperty("categories")
	private List<CategoriaDTO> categorias;
}
