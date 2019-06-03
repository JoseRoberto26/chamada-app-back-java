package com.ufba.matc84.chamadaappback.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "chamada")
public class Chamada {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chamada_id_seq")
    @SequenceGenerator(name="chamada_id_seq", sequenceName = "chamada_id_seq")
    @Column(name = "id")
    private int id;

    @Size(max = 10)
    @Column(name = "captcha")
    @NotNull
    private String captcha;

    @Column(name = "expirada")
    private Boolean expirada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public Boolean getExpirada() {
        return expirada;
    }

    public void setExpirada(Boolean expirada) {
        this.expirada = expirada;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
