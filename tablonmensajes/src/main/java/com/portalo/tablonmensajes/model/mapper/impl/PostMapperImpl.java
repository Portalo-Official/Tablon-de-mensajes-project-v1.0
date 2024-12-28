package com.portalo.tablonmensajes.model.mapper.impl;


import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import com.portalo.tablonmensajes.model.dto.response.CategoriaDTO;
import com.portalo.tablonmensajes.model.dto.response.PostDetailDTO;
import com.portalo.tablonmensajes.model.dto.response.UsuarioResumeDTO;
import com.portalo.tablonmensajes.model.entity.Post;
import com.portalo.tablonmensajes.model.mapper.PostMapper;
@Component
public class PostMapperImpl implements PostMapper {

	@Override
	public PostDetailDTO postToPostDetailDTO(Post post, UsuarioResumeDTO usuario, List<CategoriaDTO> categorias ) {
		if(Objects.nonNull(post)) {
			
			return PostDetailDTO.builder()
								.uuid(post.getUuid())
								.titulo(post.getTitulo())
								.contenido(post.getContenido())
								.usuario(mapUsuarioResume(usuario))
								.categorias(mapCategoria(categorias))
								.fechaPublicacion(post.getFechaPublicacion())
								.build();
		}
		return null;
	}

	private List<CategoriaDTO> mapCategoria(List<CategoriaDTO> categorias) {
		if(CollectionUtils.isNotEmpty(categorias)) {
			return categorias;
		}
		return Collections.emptyList();
	}

	private UsuarioResumeDTO mapUsuarioResume(UsuarioResumeDTO usuario) {
		if(Objects.nonNull(usuario)) {
			return UsuarioResumeDTO.builder().username(usuario.getUsername())
											.reference(usuario.getReference())
											.build();
		}
		return null;
	}

}
