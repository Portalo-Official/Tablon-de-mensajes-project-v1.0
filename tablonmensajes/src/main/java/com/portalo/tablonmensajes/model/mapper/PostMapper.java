package com.portalo.tablonmensajes.model.mapper;

import java.util.List;

import com.portalo.tablonmensajes.model.dto.response.CategoriaDTO;
import com.portalo.tablonmensajes.model.dto.response.PostDetailDTO;
import com.portalo.tablonmensajes.model.dto.response.UsuarioResumeDTO;
import com.portalo.tablonmensajes.model.entity.Post;

public interface PostMapper {
	public PostDetailDTO postToPostDetailDTO(Post post, UsuarioResumeDTO usuario, List<CategoriaDTO> categorias);
}
