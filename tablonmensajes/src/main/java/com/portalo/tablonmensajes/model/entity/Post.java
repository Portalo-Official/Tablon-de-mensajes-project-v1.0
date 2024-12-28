package com.portalo.tablonmensajes.model.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@Entity
@Table(name="TB_POSTS")
@NoArgsConstructor
public class Post {
	
	@Id
	private Long id;
	@Column(unique = true, nullable = false, length = 18)
	private String uuid;
	private String titulo;
	private String contenido;
	private LocalDate fechaPublicacion;
	
    @Column(name = "usuario_id", insertable = false, updatable = false)
    private Long usuarioId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
        name = "TB_POST_CATEGORIAS",
        joinColumns = @JoinColumn(name = "post_id"),
        inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    private List<Categoria> categorias;
    
	public Post( String uuid, String titulo, String contenido, LocalDate fechaPublicacion, Long usuarioId) {
		super();
		this.uuid = uuid;
		this.titulo = titulo;
		this.contenido = contenido;
		this.fechaPublicacion = fechaPublicacion;
		this.usuarioId = usuarioId;
	}
	
}
