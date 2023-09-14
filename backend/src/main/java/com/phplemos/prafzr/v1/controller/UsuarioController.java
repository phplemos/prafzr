package com.phplemos.prafzr.v1.controller;


import com.phplemos.prafzr.v1.model.UsuarioModel;
import com.phplemos.prafzr.v1.service.UsuarioService;
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
    public Optional<UsuarioModel> informacaoUsuario(@PathVariable Long id){
        return service.informacaoUsuario(id);
    }
    @PostMapping
    public UsuarioModel cadastroUsuario(@RequestBody UsuarioModel newUser){
        return service.criarUsuario(newUser);
    }

}
