package com.ufba.matc84.chamadaappback.Repository;

import com.ufba.matc84.chamadaappback.Model.PresencaAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresencaRepository extends JpaRepository<PresencaAluno, Integer> {


    PresencaAluno findFirstByAluno_IdAndChamada_IdAnd(int aluno_id, int chamada_id);


}
