package com.portalo.tablonmensajes.service.post;

import com.portalo.tablonmensajes.model.entity.Post;

public interface PostQueryService {
	/**
	 * <h1>RE_POST_001: Consultar un Post por su referencia</h1>
	 * <h2>Descripcion</h2>
	 * Realiza una consulta de un post en específico por una referencia.
	 * @param referencia
	 * @return instancia de {@linkplain Post} o {@code null} si no lo encuentra. 
	 * @author Santiago Miguez
	 * @since 09-01-2025
	 */
	Post buscarPostPorReferencia(String referencia);
	/**
	 * <h1>RE_POST_002: Consultar Posts por la referencia de un usuario</h1>
	 * <h2>Descripcion</h2>
	 * Realiza una consulta de un post en específico por una referencia.
	 * @param referencia
	 * @return instancia de {@linkplain Post} o {@code null} si no lo encuentra.
	 * @author Santiago Miguez
	 * @since 09-01-2025 
	 */
	Post buscarPostPorUsuario(String referenciaUsuario);
	
}
