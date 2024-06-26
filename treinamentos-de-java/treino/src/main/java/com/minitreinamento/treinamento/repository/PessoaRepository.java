package com.minitreinamento.treinamento.repository;

import com.minitreinamento.treinamento.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    boolean existsByEmail(String email);
}
