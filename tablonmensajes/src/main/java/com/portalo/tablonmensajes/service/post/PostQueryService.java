package com.portalo.tablonmensajes.service.post;

import com.portalo.tablonmensajes.model.dto.response.PostResponseDTO;

public interface PostQueryService {
	public PostResponseDTO buscarPostPorReferencia(String referencia);
}
