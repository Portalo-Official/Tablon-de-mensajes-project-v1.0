package com.portalo.tablonmensajes.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name="TB_USUARIO")
public class Usuario {
	@Id
	private Long id;
	@Column(unique = true, nullable = false, length = 12)
	private String uuid;
	private String userName;
	private String gmail;
	private String password;
	private String rol;
}
