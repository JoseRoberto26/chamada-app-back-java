package com.ufba.matc84.chamadaappback.Service;


import com.ufba.matc84.chamadaappback.Model.Disciplina;
import com.ufba.matc84.chamadaappback.Repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository disciplinaRepository;


    public void criarDisciplina(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
        return;
    }

}
