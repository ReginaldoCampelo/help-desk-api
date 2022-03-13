package com.reginaldo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reginaldo.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
