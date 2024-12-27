package com.portalo.tablonmensajes.service.post;

import com.portalo.tablonmensajes.model.dto.response.PostDetailDTO;

public interface PostQueryService {
	public PostDetailDTO buscarPostPorReferencia(String referencia);
}
