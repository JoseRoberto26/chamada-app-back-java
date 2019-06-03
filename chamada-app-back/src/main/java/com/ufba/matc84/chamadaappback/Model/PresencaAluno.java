package com.ufba.matc84.chamadaappback.Model;


import javax.persistence.*;

@Entity
@Table(name = "presencaAluno")
public class PresencaAluno {

    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    Usuario aluno;

    @ManyToOne
    @JoinColumn(name = "chamada_id")
    Chamada chamada;

    @Column(name = "presente")
    private Boolean presente;

    public Usuario getAluno() {
        return aluno;
    }

    public void setAluno(Usuario aluno) {
        this.aluno = aluno;
    }

    public Chamada getChamada() {
        return chamada;
    }

    public void setChamada(Chamada chamada) {
        this.chamada = chamada;
    }

    public Boolean getPresente() {
        return presente;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }
}
