package com.ufba.matc84.chamadaappback.Controller;


import com.ufba.matc84.chamadaappback.Model.Turma;
import com.ufba.matc84.chamadaappback.Service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurmaController {


    @Autowired
    TurmaService turmaService;

    @RequestMapping(method = RequestMethod.GET, value = "/turma/cadastrar")
    public ResponseEntity criarTurma(@RequestBody Turma turma){

        turmaService.criarTurma(turma);
        ResponseEntity responseEntity = ResponseEntity.status(HttpStatus.OK).build();
        return responseEntity;
    }


}


