package com.portalo.tablonmensajes.service.post;

import com.portalo.tablonmensajes.model.dto.response.PostDetailDTO;
import com.portalo.tablonmensajes.model.dto.response.PostResumeDTO;

public interface PostQueryService {
	/**
	 * <h1>RE_POST_001: Consultar un Post por su referencia</h1>
	 * <h2>Descripcion</h2>
	 * Realiza una consulta de un post en específico por una referencia.
	 * @param referencia
	 * @return instancia de {@linkplain PostDetailDTO} o {@code null} si no lo encuentra. 
	 * @author Santiago Miguez
	 * @since 09-01-2025
	 */
	PostDetailDTO buscarPostPorReferencia(String referencia);
	/**
	 * <h1>RE_POST_002: Consultar Posts por la referencia de un usuario</h1>
	 * <h2>Descripcion</h2>
	 * Realiza una consulta de un post en específico por una referencia.
	 * @param referencia
	 * @return instancia de {@linkplain PostResumeDTO} o {@code null} si no lo encuentra.
	 * @author Santiago Miguez
	 * @since 09-01-2025 
	 */
	PostResumeDTO buscarPostPorUsuario(String referenciaUsuario);
	
}
