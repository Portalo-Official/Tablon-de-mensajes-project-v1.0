package com.portalo.tablonmensajes.service.post.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.portalo.tablonmensajes.model.dto.PostDTO;
import com.portalo.tablonmensajes.model.entity.Post;
import com.portalo.tablonmensajes.repository.PostRepositroy;
import com.portalo.tablonmensajes.service.post.PostQueryService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostQueryServiceImpl implements PostQueryService {

	private final PostRepositroy postRepositroy;
	
	@Override
	public PostDTO buscarPostPorReferencia(String referencia) {
		Optional<Post> postOptional = this.postRepositroy.buscarPostPorReferencia(referencia);
		if(postOptional.isPresent()) {
			//TODO hacer mapper y return
		}
		return null;
	}

}
