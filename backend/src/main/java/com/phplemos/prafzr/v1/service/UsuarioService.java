package com.phplemos.prafzr.v1.service;



import com.phplemos.prafzr.v1.model.UsuarioModel;
import com.phplemos.prafzr.v1.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 *
 * @author phplemos
 */

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public UsuarioModel criarUsuario(UsuarioModel user){
        UsuarioModel novo = new UsuarioModel();
        novo.setNome(user.getNome());
        novo.setSenha(user.getSenha());
        novo.setEmail(user.getEmail());
        return repository.save(novo);
    }

    public Optional<UsuarioModel> informacaoUsuario(Long id){
        return repository.findById(id);
    }
}
