package com.portalo.tablonmensajes.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name="TB_MENSAJES")
@NoArgsConstructor
public class Mensaje {
	@Id
	private Long id;
	@Column(unique = true, nullable = false, length = 36)
	private String uuid;
	private String contenido;
	private LocalDate fechaPublicacion;
	
	//RELACIONES
	private Long postId;
	private Long usuarioId;

	public Mensaje(String uuid, String contenido, LocalDate fechaPublicacion, Long postId, Long usuarioId) {
		super();
		this.uuid = uuid;
		this.contenido = contenido;
		this.fechaPublicacion = fechaPublicacion;
		this.postId = postId;
		this.usuarioId = usuarioId;
	}
}
