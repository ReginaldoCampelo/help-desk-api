package com.reginaldo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reginaldo.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
