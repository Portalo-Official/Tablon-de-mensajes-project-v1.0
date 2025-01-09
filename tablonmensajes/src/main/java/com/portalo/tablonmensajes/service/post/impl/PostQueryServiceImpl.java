package com.portalo.tablonmensajes.service.post.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.portalo.tablonmensajes.model.dto.response.CategoriaDTO;
import com.portalo.tablonmensajes.model.dto.response.PostDetailDTO;
import com.portalo.tablonmensajes.model.dto.response.PostResumeDTO;
import com.portalo.tablonmensajes.model.dto.response.UsuarioResumeDTO;
import com.portalo.tablonmensajes.model.entity.Post;
import com.portalo.tablonmensajes.model.mapper.CategoriaMapper;
import com.portalo.tablonmensajes.model.mapper.PostMapper;
import com.portalo.tablonmensajes.model.mapper.UsuarioMapper;
import com.portalo.tablonmensajes.repository.PostRepositroy;
import com.portalo.tablonmensajes.service.post.PostQueryService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostQueryServiceImpl implements PostQueryService {

	private final PostRepositroy postRepositroy;
	private final PostMapper postMapper;
	private final UsuarioMapper usuarioMapper;
	private final CategoriaMapper categoriaMapper;
	@Override
	public PostDetailDTO buscarPostPorReferencia(String referencia) {
		Optional<Post> postOptional = this.postRepositroy.buscarPostPorReferencia(referencia);
		if(postOptional.isPresent()) {
			
			List<CategoriaDTO> categoriasDto=  categoriaMapper.entityListToDtoList(postOptional.get().getCategorias());
			UsuarioResumeDTO usuarioResume= usuarioMapper.entityToResume(postOptional.get().getUsuario());
			return postMapper.postToPostDetailDTO(postOptional.get(), usuarioResume, categoriasDto);
		}
		return null;
	}
	
	@Override
	public PostResumeDTO buscarPostPorUsuario(String referenciaUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
