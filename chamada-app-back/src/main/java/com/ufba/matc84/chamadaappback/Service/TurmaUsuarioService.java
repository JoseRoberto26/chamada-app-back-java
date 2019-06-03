package com.ufba.matc84.chamadaappback.Service;


import com.ufba.matc84.chamadaappback.Model.TurmaUsuario;
import com.ufba.matc84.chamadaappback.Model.Usuario;
import com.ufba.matc84.chamadaappback.Repository.TurmaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaUsuarioService {

    @Autowired
    TurmaUsuarioRepository turmaUsuarioRepository;


    public List<TurmaUsuario> buscarTurmas(Usuario usuario){
        List<TurmaUsuario> turmas = turmaUsuarioRepository.findAllByUsuario_id(usuario.getId());
        return turmas;
    }

}
