package com.ufba.matc84.chamadaappback.Service;


import com.ufba.matc84.chamadaappback.Model.Turma;
import com.ufba.matc84.chamadaappback.Repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurmaService {

    @Autowired
    TurmaRepository turmaRepository;


    public void criarTurma(Turma turma){
        turmaRepository.save(turma);
        return;
    }


}
