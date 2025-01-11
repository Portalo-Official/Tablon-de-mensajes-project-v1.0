package com.portalo.tablonmensajes.service.post.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.portalo.tablonmensajes.model.dto.response.CategoriaDTO;
import com.portalo.tablonmensajes.model.dto.response.PostDetailDTO;
import com.portalo.tablonmensajes.model.dto.response.PostResumeDTO;
import com.portalo.tablonmensajes.model.dto.response.UsuarioResumeDTO;
import com.portalo.tablonmensajes.model.entity.Post;
import com.portalo.tablonmensajes.model.mapper.CategoriaMapper;
import com.portalo.tablonmensajes.model.mapper.PostMapper;
import com.portalo.tablonmensajes.model.mapper.UsuarioMapper;
import com.portalo.tablonmensajes.service.post.PostDomainService;
import com.portalo.tablonmensajes.service.post.PostPersistenceService;
import com.portalo.tablonmensajes.service.post.PostQueryService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostDomainServiceImpl implements PostDomainService {

	private final PostQueryService postQuery;
	private final PostPersistenceService postPersistence;
	private final PostMapper postMapper;
	private final UsuarioMapper usuarioMapper;
	private final CategoriaMapper categoriaMapper;
	
	@Override
	public PostDetailDTO consultarPorReferencia(String referenciaPost) {
		PostDetailDTO response = null;
		
		Post postDB = this.postQuery.buscarPostPorReferencia(referenciaPost);
		if(Objects.nonNull(postDB)) {
			
			List<CategoriaDTO> categoriasDto=  categoriaMapper.entityListToDtoList(postDB.getCategorias());
			UsuarioResumeDTO usuarioResume= usuarioMapper.entityToResume(postDB.getUsuario());
			response = postMapper.postToPostDetailDTO(postDB, usuarioResume, categoriasDto);
		}
		return response;
	}

	@Override
	public List<PostResumeDTO> consultarPorUsuario(String referenciaUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
