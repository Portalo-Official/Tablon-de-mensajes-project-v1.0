package com.portalo.tablonmensajes.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name="TB_USUARIOS")
@NoArgsConstructor
public class Usuario {
	@Id
	private Long id;
	@Column(unique = true, nullable = false, length = 12)
	private String uuid;
	@Column(unique = true, nullable = false, length = 50)
	private String username;
	private String gmail;
	private String password;
	private String rol;
	
	public Usuario(String uuid, String username, String gmail, String password, String rol) {
		super();
		this.uuid = uuid;
		this.username = username;
		this.gmail = gmail;
		this.password = password;
		this.rol = rol;
	}
	
}
