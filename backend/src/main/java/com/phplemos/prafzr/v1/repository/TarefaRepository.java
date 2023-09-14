package com.phplemos.prafzr.v1.repository;

import com.phplemos.prafzr.v1.model.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {

}
