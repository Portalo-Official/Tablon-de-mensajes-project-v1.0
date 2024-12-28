package com.portalo.tablonmensajes.model.mapper.impl;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import com.portalo.tablonmensajes.model.dto.response.CategoriaDTO;
import com.portalo.tablonmensajes.model.entity.Categoria;
import com.portalo.tablonmensajes.model.mapper.CategoriaMapper;
@Component
public class CategoriaMapperImpl implements CategoriaMapper {

	@Override
	public CategoriaDTO entityToDto(Categoria categoria) {
		if(Objects.isNull(categoria)) return null;
		return CategoriaDTO.builder()
							.id(categoria.getId())
							.nombre(categoria.getNombre())
							.build();
	}

	@Override
	public List<CategoriaDTO> entityListToDtoList(List<Categoria> categorias) {
		if(CollectionUtils.isNotEmpty(categorias)) {
			return categorias.stream()
							.map(this::entityToDto)
							.toList();
		}
		return Collections.emptyList();
	}

}
