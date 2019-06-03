package com.ufba.matc84.chamadaappback.Model;

import javax.persistence.*;

@Entity
@Table(name = "turma_usuario")
public class TurmaUsuario {

    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private int usuario_id;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private int turma_id;
}
