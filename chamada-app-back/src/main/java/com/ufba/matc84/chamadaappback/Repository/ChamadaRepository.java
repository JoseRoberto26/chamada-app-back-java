package com.ufba.matc84.chamadaappback.Repository;

import com.ufba.matc84.chamadaappback.Model.Chamada;
import com.ufba.matc84.chamadaappback.Model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamadaRepository extends JpaRepository<Chamada, Integer> {

    Chamada findFirstByCaptchaAndTurma(String captcha, int turma_id);

    Chamada findFirstByTurmaIdAndExpiradaEqualsFalse(int turma_id);

}
