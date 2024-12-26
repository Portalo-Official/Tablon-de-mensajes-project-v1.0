package com.portalo.tablonmensajes.model.mapper;

import com.portalo.tablonmensajes.model.dto.response.PostResponseDTO;
import com.portalo.tablonmensajes.model.dto.response.UsuarioResumeDTO;
import com.portalo.tablonmensajes.model.entity.Post;

public interface PostMapper {
	public PostResponseDTO requestToPost(Post post, UsuarioResumeDTO usuario);
}
