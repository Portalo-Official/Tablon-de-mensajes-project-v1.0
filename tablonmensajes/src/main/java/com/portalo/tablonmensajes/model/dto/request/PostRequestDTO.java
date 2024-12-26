package com.portalo.tablonmensajes.model.dto.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class PostRequestDTO {
	@JsonProperty("post_reference")
	private String uuid;
	@JsonProperty("title")
	private String titulo;
	@JsonProperty("body")
	private String contenido;
	
}
