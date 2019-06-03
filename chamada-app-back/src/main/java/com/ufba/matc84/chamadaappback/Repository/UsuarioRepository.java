package com.ufba.matc84.chamadaappback.Repository;

import com.ufba.matc84.chamadaappback.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findFirstByCpfAndAndSenha(String cpf, String senha);

}
