package com.portalo.tablonmensajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portalo.tablonmensajes.model.entity.Mensaje;
@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Long>{

}
