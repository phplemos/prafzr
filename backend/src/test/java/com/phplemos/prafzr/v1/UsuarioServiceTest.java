package com.phplemos.prafzr.v1;


import com.phplemos.prafzr.v1.entity.Usuario;
import com.phplemos.prafzr.v1.service.UsuarioService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
public class UsuarioServiceTest {
    @TestConfiguration
    static class UsuarioServiceTestConfiguration{
        @Bean
        public UsuarioService usuarioService(){
            return new UsuarioService();
        }

    }
    @Autowired
    UsuarioService service;

    @Test
    public void teste_cadastro_usuario_bd(){
        Usuario user = new Usuario();
        user.setNome("Pedro");
        user.setEmail("test@gmail.com");
        user.setSenha("1234");
        Usuario criado = service.criarUsuario(user);
        assertEquals(user.getNome(),criado.getNome());
        assertEquals(user.getSenha(),criado.getSenha());
        assertEquals(user.getEmail(),criado.getEmail());
    }

}
