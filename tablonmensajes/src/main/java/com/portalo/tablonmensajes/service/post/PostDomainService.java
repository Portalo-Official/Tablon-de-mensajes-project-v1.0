package com.portalo.tablonmensajes.service.post;

import java.util.List;

import com.portalo.tablonmensajes.model.dto.response.PostDetailDTO;
import com.portalo.tablonmensajes.model.dto.response.PostResumeDTO;

public interface PostDomainService {

	PostDetailDTO consultarPorReferencia(String referenciaPost);
	List<PostResumeDTO> consultarPorUsuario(String referenciaUsuario);
}
