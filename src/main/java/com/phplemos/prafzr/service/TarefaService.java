package com.phplemos.prafzr.service;

import com.phplemos.prafzr.model.Tarefa;
import com.phplemos.prafzr.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public List<Tarefa> todasTarefas(){
        return repository.findAll();
    }

    public Optional<Tarefa> tarefaPorId(UUID id){
        return repository.findById(id);
    }

    public Tarefa adicionarTarefa(Tarefa newTarefa){
        return repository.save(newTarefa);
    }

    public Boolean editarTarefa(UUID id, Tarefa newTarefa){

        Optional<Tarefa> tarefa = repository.findById(id); //Buscando a tarefa para alterar o status
        Tarefa alterada = new Tarefa(); // Criando uma instancia de Tarefa para pode substituir o estado

        alterada.setId(tarefa.get().getId()); // passado todos os parametros para a nova instancia
        alterada.setTitulo(newTarefa.getTitulo()); //passando alterações
        alterada.setDescricao(newTarefa.getDescricao());
        alterada.setDataVencimento(newTarefa.getDataVencimento());
        alterada.setStatus(newTarefa.getStatus());

        // verificando se salvou
        return repository.save(alterada) != null;
    }

    public void excluirTarefa(UUID id){
        repository.deleteById(id);
    }




}
