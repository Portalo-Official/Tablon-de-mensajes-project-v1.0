package com.portalo.tablonmensajes.model.mapper;

import com.portalo.tablonmensajes.model.dto.response.PostDetailDTO;
import com.portalo.tablonmensajes.model.dto.response.UsuarioResumeDTO;
import com.portalo.tablonmensajes.model.entity.Post;

public interface PostMapper {
	public PostDetailDTO postToPostDetailDTO(Post post, UsuarioResumeDTO usuario);
}
