package com.phplemos.prafzr.v1.repository;


import com.phplemos.prafzr.v1.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends JpaRepository<UsuarioModel, Long> {

}
