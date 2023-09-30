package com.phplemos.prafzr.v1.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDate;

/**
 *
 * @author phplemos
 *
 */

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel extends RepresentationModel<UsuarioModel> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String senha;
    private String email;
    private LocalDate localDate = LocalDate.now();

    public UsuarioModel(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
}
