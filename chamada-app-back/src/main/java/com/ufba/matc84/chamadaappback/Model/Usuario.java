package com.ufba.matc84.chamadaappback.Model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_id_seq")
    @SequenceGenerator(name="usuario_id_seq", sequenceName = "usuario_id_seq")
    @Column(name = "id")
    private int id;

    @Size(max = 160)
    @Column(name = "nome")
    @NotNull
    private String nome;

    @Size(max = 11)
    @Column(name = "cpf")
    @NotNull
    private String cpf;

    @Size(max = 20)
    @Column(name = "matricula")
    @NotNull
    private String matricula;

    @Size(max = 20)
    @Column(name = "tipo_usuario")
    @NotNull
    private String tipo_usuario;

    @Size(max = 50)
    @Column(name = "senha")
    @NotNull
    private String senha;

    @OneToMany(mappedBy = "usuario")
    private List<Turma_usuario> turmas_usuario = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
