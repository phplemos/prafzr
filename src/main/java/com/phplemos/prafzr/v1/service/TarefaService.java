package com.phplemos.prafzr.v1.service;

import com.phplemos.prafzr.v1.controller.TarefaController;
import com.phplemos.prafzr.v1.model.TarefaModel;
import com.phplemos.prafzr.v1.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@Service
public class TarefaService {

    @Autowired
    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<List<TarefaModel>> todasTarefas(){
        List<TarefaModel> listaTarefas = repository.findAll();
        if(listaTarefas.isEmpty())return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        for (TarefaModel tarefa: listaTarefas) {
            Link newLink = linkTo(methodOn(TarefaController.class).todasTarefas()).withSelfRel();
            tarefa.add(newLink);
            Long id = tarefa.getId();
            newLink = linkTo(methodOn(TarefaController.class).tarefaPorId(id)).withRel("id");
            tarefa.add(newLink);
        }
        return new ResponseEntity<List<TarefaModel>>(listaTarefas,HttpStatus.OK);
    }



    public ResponseEntity<TarefaModel> tarefaPorId(Long id){
        Optional<TarefaModel> optTarefa = repository.findById(id);
        if (optTarefa.isPresent()) {
            TarefaModel tarefa = new TarefaModel();
            Long idTarefa = optTarefa.get().getId();
            Link linkUri = linkTo(methodOn(TarefaController.class).tarefaPorId(id)).withRel("URI To access");
            tarefa.setId(optTarefa.get().getId());
            tarefa.setTitulo(optTarefa.get().getTitulo());
            tarefa.setDescricao(optTarefa.get().getDescricao());
            tarefa.setStatus(optTarefa.get().getStatus());
            tarefa.setDataVencimento(optTarefa.get().getDataVencimento());
            tarefa.add(linkUri);
            return new ResponseEntity<>(tarefa,HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity adicionarTarefa(TarefaModel newTarefa){
        if(repository.save(newTarefa) == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(HttpStatus.OK);
    }



    public void excluirTarefa(Long id){
        repository.deleteById(id);
    }




}
