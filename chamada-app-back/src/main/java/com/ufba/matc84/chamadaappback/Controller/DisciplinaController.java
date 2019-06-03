package com.ufba.matc84.chamadaappback.Controller;


import com.ufba.matc84.chamadaappback.Model.Disciplina;
import com.ufba.matc84.chamadaappback.Service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DisciplinaController {

    @Autowired
    DisciplinaService disciplinaService;

    @RequestMapping(value ="disciplina/cadastrar", method = RequestMethod.POST)
    public ResponseEntity criarDisciplina(@RequestBody Disciplina disciplina){
        disciplinaService.criarDisciplina(disciplina);
        ResponseEntity responseEntity = ResponseEntity.status(HttpStatus.OK).build();
        return  responseEntity;
    }


}
