package com.reginaldo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reginaldo.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
