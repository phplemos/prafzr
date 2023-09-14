package com.phplemos.prafzr.controller;

import com.phplemos.prafzr.model.Tarefa;
import com.phplemos.prafzr.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @GetMapping
    public List<Tarefa> todasTarefas(){
        return service.todasTarefas();
    }

    @GetMapping("/{id}")
    public Optional<Tarefa> tarefaPorId(@PathVariable UUID id){
        return service.tarefaPorId(id);
    }

    @PostMapping
    public Tarefa adicionarTarefa(@RequestBody Tarefa newTarefa){
        return service.adicionarTarefa(newTarefa);
    }

    @PutMapping("/{id}")
    public String editarTarefa(@PathVariable UUID id, @RequestBody Tarefa alterada){
        if(service.editarTarefa(id,alterada)){
            return "Tarefa alterada com sucesso";
        }
        return "Falha ao alterar a tarefa";
    }

    @DeleteMapping("/{id}")
    public void Delete(UUID id){
        service.excluirTarefa(id);
    }




}
