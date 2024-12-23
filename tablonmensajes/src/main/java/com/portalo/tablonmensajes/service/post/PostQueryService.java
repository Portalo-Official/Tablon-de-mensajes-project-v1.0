package com.portalo.tablonmensajes.service.post;

import com.portalo.tablonmensajes.model.dto.PostDTO;

public interface PostQueryService {
	public PostDTO buscarPostPorReferencia(String referencia);
}
