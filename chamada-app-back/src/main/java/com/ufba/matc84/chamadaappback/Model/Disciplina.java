package com.ufba.matc84.chamadaappback.Model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "disciplina")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "disciplina_id_seq")
    @SequenceGenerator(name="disciplina_id_seq", sequenceName = "disciplina_id_seq")
    @Column(name = "id")
    private int id;

    @Size(max = 160)
    @Column(name = "nome")
    @NotNull
    private String nome;

    @Size(max = 160)
    @Column(name = "codigo")
    @NotNull
    private String codigo;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "disciplina_id")
    private List<Turma> turmas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
