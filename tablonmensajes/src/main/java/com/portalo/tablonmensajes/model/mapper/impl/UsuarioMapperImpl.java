package com.portalo.tablonmensajes.model.mapper.impl;

import java.util.Objects;

import org.springframework.stereotype.Component;

import com.portalo.tablonmensajes.model.dto.response.UsuarioResumeDTO;
import com.portalo.tablonmensajes.model.entity.Usuario;
import com.portalo.tablonmensajes.model.mapper.UsuarioMapper;
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

	@Override
	public UsuarioResumeDTO entityToResume(Usuario usuario) {
		if(Objects.isNull(usuario)) return null;
		
		return UsuarioResumeDTO.builder()
						.username(usuario.getUsername())
						.reference(usuario.getUuid())
						.build();
	}

}
