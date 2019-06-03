package com.ufba.matc84.chamadaappback.Controller;


import com.ufba.matc84.chamadaappback.Model.Usuario;
import com.ufba.matc84.chamadaappback.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;


    @RequestMapping(value = "logar")
    public Usuario getLogarUsuarioByParameters(@RequestParam String cpf, @RequestParam String senha){
        return usuarioService.logar(cpf, senha);
    }



}
