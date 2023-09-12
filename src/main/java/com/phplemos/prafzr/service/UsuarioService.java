package com.phplemos.prafzr.service;


import com.phplemos.prafzr.model.Usuario;
import com.phplemos.prafzr.repository.UsuarioRepository;
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

    public Usuario criarUsuario(Usuario user){
        Usuario novo = new Usuario();
        novo.setNome(user.getNome());
        novo.setSenha(user.getSenha());
        novo.setEmail(user.getEmail());
        return repository.save(novo);
    }

    public Optional<Usuario> informacaoUsuario(UUID id){
        return repository.findById(id);
    }
}
