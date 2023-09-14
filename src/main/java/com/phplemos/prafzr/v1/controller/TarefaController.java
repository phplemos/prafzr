package com.phplemos.prafzr.v1.controller;

import com.phplemos.prafzr.v1.model.TarefaModel;
import com.phplemos.prafzr.v1.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @GetMapping
    public ResponseEntity<List<TarefaModel>> todasTarefas(){
        return service.todasTarefas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TarefaModel> tarefaPorId(@PathVariable Long id){
        return service.tarefaPorId(id);
    }

    @PostMapping
    public ResponseEntity adicionarTarefa(@RequestBody TarefaModel newTarefa){
        return service.adicionarTarefa(newTarefa);
    }


}
