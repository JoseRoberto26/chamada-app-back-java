package com.ufba.matc84.chamadaappback.Repository;

import com.ufba.matc84.chamadaappback.Model.TurmaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurmaUsuarioRepository extends JpaRepository<TurmaUsuario, Integer> {

    List<TurmaUsuario> findAllByUsuario_id(int usuario_id);

}
