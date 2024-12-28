package com.portalo.tablonmensajes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portalo.tablonmensajes.model.dto.response.PostDetailDTO;
import com.portalo.tablonmensajes.service.post.PostQueryService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("posts")
public class PostController {
	
	private final PostQueryService postService;
	
	/**
	 * <h1>REQ_P_006 Consultar Post por Referencia</h1>
	 * @return
	 */
	@GetMapping("{post_referencia}")
	private ResponseEntity<Object> getPostPorReferencia(
			@PathVariable("post_referencia") String postReferencia
			) {
		
		PostDetailDTO post = postService.buscarPostPorReferencia(postReferencia);
		
		return ResponseEntity.ok(postReferencia);
	}
}
