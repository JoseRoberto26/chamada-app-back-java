package com.ufba.matc84.chamadaappback.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Turma_usuario {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private int usuario_id;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private int turma_id;
}
