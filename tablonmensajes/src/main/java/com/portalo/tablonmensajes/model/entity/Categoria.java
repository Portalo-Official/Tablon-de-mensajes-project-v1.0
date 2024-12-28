package com.portalo.tablonmensajes.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name="TB_CATEGORIAS")
public class Categoria {

	@Id
	private Integer id;
	@Column(unique = true, nullable = true, length = 50)
	private String nombre;
	
}
