package com.ufba.matc84.chamadaappback.Controller;


import com.ufba.matc84.chamadaappback.Model.Usuario;
import com.ufba.matc84.chamadaappback.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;


    @RequestMapping(value = "/logar", method = RequestMethod.GET)
    public Usuario getLogarUsuarioByParameters(@RequestParam String cpf, @RequestParam String senha){
        return usuarioService.logar(cpf, senha);
    }

    @RequestMapping(value = "usuario/cadastrar", method = RequestMethod.POST)
    public ResponseEntity cadastrarUsuario(@RequestBody Usuario usuario){

        usuarioService.cadastrar(usuario);
        ResponseEntity responseEntity = ResponseEntity.status(HttpStatus.OK).build();
        return responseEntity;

    }



}
