package com.portalo.tablonmensajes.model.mapper.impl;


import java.util.Objects;

import com.portalo.tablonmensajes.model.dto.response.PostDetailDTO;
import com.portalo.tablonmensajes.model.dto.response.UsuarioResumeDTO;
import com.portalo.tablonmensajes.model.entity.Post;
import com.portalo.tablonmensajes.model.mapper.PostMapper;

public class PostMapperImpl implements PostMapper {

	@Override
	public PostDetailDTO postToPostDetailDTO(Post post, UsuarioResumeDTO usuario ) {
		if(Objects.nonNull(post)) {
			
			return PostDetailDTO.builder()
								.uuid(post.getUuid())
								.titulo(post.getTitulo())
								.contenido(post.getContenido())
								.usuario(mapUsuarioResume(usuario))
								.fechaPublicacion(post.getFechaPublicacion())
								.build();
		}
		return null;
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
