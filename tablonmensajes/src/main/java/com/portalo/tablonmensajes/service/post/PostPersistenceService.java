package com.portalo.tablonmensajes.service.post;

import com.portalo.tablonmensajes.model.dto.plain.PostDTO;
import com.portalo.tablonmensajes.model.dto.response.PostDetailDTO;

public interface PostPersistenceService {

	PostDetailDTO crear(PostDTO postDTO);
	Boolean eliminar(PostDTO postDTO);
}
