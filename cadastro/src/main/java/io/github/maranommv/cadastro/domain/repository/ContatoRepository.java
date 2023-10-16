package io.github.maranommv.cadastro.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.maranommv.cadastro.domain.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
    
}
