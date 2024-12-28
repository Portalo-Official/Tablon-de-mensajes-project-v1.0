package com.portalo.tablonmensajes.model.mapper;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.portalo.tablonmensajes.model.entity.Post;
import com.portalo.tablonmensajes.model.entity.Usuario;
import com.portalo.tablonmensajes.model.mapper.impl.PostMapperImpl;

class PostMapperTest {

	private PostMapper postMapper = new PostMapperImpl(); 
	private Post post;
	private Usuario usuario;
	@BeforeAll
	void setUpBeforeClass() throws Exception {
		post = new Post("3214",
				"Recetas de cocina",
				"Cree recetas de cocina con estos increibles tips!",
				LocalDate.now(),
				54321l);
		
	}

	@Test
	void testPostToPostDetailDTO() {
		
	}

}
