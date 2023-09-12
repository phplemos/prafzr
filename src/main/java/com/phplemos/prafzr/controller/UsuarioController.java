package com.phplemos.prafzr.controller;


import com.phplemos.prafzr.model.Usuario;
import com.phplemos.prafzr.repository.UsuarioRepository;
import com.phplemos.prafzr.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping("/{id}")
    public Optional<Usuario> informacaoUsuario(@PathVariable UUID id){
        return service.informacaoUsuario(id);
    }
    @PostMapping
    public Usuario cadastroUsuario(@RequestBody Usuario newUser){
        return service.criarUsuario(newUser);
    }

}
