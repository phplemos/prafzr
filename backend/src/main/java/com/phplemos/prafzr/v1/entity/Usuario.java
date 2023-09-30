package com.phplemos.prafzr.v1.entity;


import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Objects;

@Component
public class Usuario {

    private Long id;
    private String nome;
    private String senha;
    private String email;
    private LocalDate localDate;

    public Usuario() {

    }

    public Usuario(Long id, String nome, String senha, String email, LocalDate localDate) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.localDate = localDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) && Objects.equals(nome, usuario.nome) && Objects.equals(senha, usuario.senha) && Objects.equals(email, usuario.email) && Objects.equals(localDate, usuario.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, senha, email, localDate);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
