package com.portalo.tablonmensajes.model.mapper;

import java.util.List;

import com.portalo.tablonmensajes.model.dto.response.CategoriaDTO;
import com.portalo.tablonmensajes.model.entity.Categoria;

public interface CategoriaMapper {
	CategoriaDTO entityToDto (Categoria categoria);
	List<CategoriaDTO> entityListToDtoList (List<Categoria> categorias);
}
