package com.ufba.matc84.chamadaappback.Repository;


import com.ufba.matc84.chamadaappback.Model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> {
}
