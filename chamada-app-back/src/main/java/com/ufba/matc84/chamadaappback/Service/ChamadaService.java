package com.ufba.matc84.chamadaappback.Service;


import com.ufba.matc84.chamadaappback.Model.Chamada;
import com.ufba.matc84.chamadaappback.Model.Turma;
import com.ufba.matc84.chamadaappback.Repository.ChamadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChamadaService {


    @Autowired
    ChamadaRepository chamadaRepository;


    public void criarChamada(List<Turma> turmaList){

    }
}
