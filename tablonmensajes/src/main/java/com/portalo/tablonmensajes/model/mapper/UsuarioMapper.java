package com.portalo.tablonmensajes.model.mapper;

import com.portalo.tablonmensajes.model.dto.response.UsuarioResumeDTO;
import com.portalo.tablonmensajes.model.entity.Usuario;

public interface UsuarioMapper {
	UsuarioResumeDTO entityToResume(Usuario usuario);
}
