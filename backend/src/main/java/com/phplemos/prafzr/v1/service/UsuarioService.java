package com.phplemos.prafzr.v1.service;



import com.phplemos.prafzr.v1.entity.Usuario;
import com.phplemos.prafzr.v1.model.UsuarioModel;
import com.phplemos.prafzr.v1.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 *
 * @author phplemos
 */

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;


    public Usuario criarUsuario(Usuario user) {
        Usuario retorno = new Usuario();
        UsuarioModel novoUsuario = repository.save(new UsuarioModel(user.getNome(),user.getSenha(),user.getEmail()));
        System.out.println(novoUsuario);
        retorno.setId(novoUsuario.getId());
        retorno.setNome(novoUsuario.getNome());
        retorno.setSenha(novoUsuario.getSenha());
        retorno.setEmail(novoUsuario.getSenha());
        retorno.setLocalDate(novoUsuario.getLocalDate());
        return retorno;
    }
}
