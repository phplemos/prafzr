package com.phplemos.prafzr.repository;

import com.phplemos.prafzr.model.Tarefa;
import com.phplemos.prafzr.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, UUID> {

}
