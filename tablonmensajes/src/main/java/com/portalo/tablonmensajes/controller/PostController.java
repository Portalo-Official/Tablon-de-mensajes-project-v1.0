package com.portalo.tablonmensajes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Post")
public class PostController {
	
	
	/**
	 * <h1>REQ_P_006 Consultar Post por Referencia</h1>
	 * @return
	 */
	@GetMapping("get")
	private ResponseEntity<Object> getPostPorReferencia() {
		
		return ResponseEntity.ok("Todo Okey");
	}
}
