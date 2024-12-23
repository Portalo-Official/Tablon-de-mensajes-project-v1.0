package com.portalo.tablonmensajes.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_POSTS")
public class Post {
	
	@Id
	private Long id;
	@Column(unique = true, nullable = false, length = 18)
	private String uuid;
	private String titulo;
	private String contenido;
	private LocalDate fechaPublicacion;
	
	private Long usuarioId;

	public Post( String uuid, String titulo, String contenido, LocalDate fechaPublicacion, Long usuarioId) {
		super();
		this.uuid = uuid;
		this.titulo = titulo;
		this.contenido = contenido;
		this.fechaPublicacion = fechaPublicacion;
		this.usuarioId = usuarioId;
	}
	
}
