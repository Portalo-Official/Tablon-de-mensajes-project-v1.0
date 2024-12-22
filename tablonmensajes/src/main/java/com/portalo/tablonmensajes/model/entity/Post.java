package com.portalo.tablonmensajes.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_POST")
public class Post {
	
	@Id
	private Long id;
	private String titulo;
	
	
}
