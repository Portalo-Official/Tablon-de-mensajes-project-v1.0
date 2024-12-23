package com.portalo.tablonmensajes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.portalo.tablonmensajes.model.entity.Post;
@Repository
public interface PostRepositroy extends JpaRepository<Post, Long>{
	
	@Query("SELECT p FROM Post p WHERE p.uuid= :referencia")
	Optional<Post> buscarPostPorReferencia(@Param("referencia") String referencia);
	
	
}
