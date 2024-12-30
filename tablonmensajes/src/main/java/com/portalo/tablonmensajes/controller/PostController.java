package com.portalo.tablonmensajes.controller;

import org.aspectj.apache.bcel.classfile.Module.Require;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portalo.tablonmensajes.model.dto.response.PostDetailDTO;
import com.portalo.tablonmensajes.model.validation.domain.ReferenciaDomain;
import com.portalo.tablonmensajes.service.post.PostQueryService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("posts")
public class PostController {
	
	private final PostQueryService postService;
	
	/**
	 * <h1>REQ_P_001 Consultar Post por Referencia</h1>
	 * @return
	 */
	@GetMapping("{post_referencia}")
	private ResponseEntity<Object> getPostPorReferencia(
			@PathVariable("post_referencia") String postReferencia
			) {
		
		PostDetailDTO post = postService.buscarPostPorReferencia(postReferencia);
		
		return ResponseEntity.ok(post);
	}
	@Valid
	@GetMapping("/prueba/{id_usuario}")
	private ResponseEntity<Object> getPruebaValidaciones(
			@ReferenciaDomain @PathVariable("id_usuario") String idUsuario,
			@RequestParam(name = "categoria", required = false ) String categoria,
			@RequestParam(name ="respuestas", required = false ) Integer respuestas
			) {
		
		
		return ResponseEntity.ok("Todo Validado");
	}
}
