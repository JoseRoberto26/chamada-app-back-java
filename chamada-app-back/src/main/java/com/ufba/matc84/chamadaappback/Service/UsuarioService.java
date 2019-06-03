package com.ufba.matc84.chamadaappback.Service;

import com.ufba.matc84.chamadaappback.Exception.ObjectAlreadyExistsException;
import com.ufba.matc84.chamadaappback.Exception.ObjectNotFoundException;
import com.ufba.matc84.chamadaappback.Model.Usuario;
import com.ufba.matc84.chamadaappback.Repository.UsuarioRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario logar(String cpf, String senha){
       Usuario usuario = usuarioRepository.findFirstByCpfAndAndSenha(cpf, senha).orElseThrow(() -> new ObjectNotFoundException("Usuário com o cpf" +cpf+ "não encontrado"));
        return usuario;
    }

    public void cadastrar(Usuario usuario){
        Usuario usuario1 = usuarioRepository.findFirstByCpfAndAndSenha(usuario.getCpf(), usuario.getSenha()).get();
        if(usuario1 != null){
            throw new ObjectAlreadyExistsException("Usuário já cadastrado com o CPF");
            }
        else{
            usuarioRepository.save(usuario);
            return;
        }
    }

}
