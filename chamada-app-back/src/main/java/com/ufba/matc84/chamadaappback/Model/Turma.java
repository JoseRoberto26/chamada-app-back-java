package com.ufba.matc84.chamadaappback.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "turma_id_seq")
    @SequenceGenerator(name="turma_id_seq", sequenceName = "turma_id_seq")
    @Column(name = "id")
    private int id;

    @Size(max = 160)
    @Column(name = "codigo")
    @NotNull
    private String codigo;

    @Column(name = "dias")
    @NotNull
    private String[] dias;

    @Column(name = "horario")
    @NotNull
    private String[] horario;

    @Column(name = "semestre")
    @NotNull
    private String semestre;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "turma_id")
    private List<Chamada> chamadas = new ArrayList<>();

    @OneToMany(mappedBy = "turma")
    private List<TurmaUsuario> usuarios_turma = new ArrayList<>();

    public List<Chamada> getChamadas() {
        return chamadas;
    }

    public void setChamadas(List<Chamada> chamadas) {
        this.chamadas = chamadas;
    }

    public String getCodigo() {
        return codigo;

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String[] getDias() {
        return dias;
    }

    public void setDias(String[] dias) {
        this.dias = dias;
    }

    public String[] getHorario() {
        return horario;
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
