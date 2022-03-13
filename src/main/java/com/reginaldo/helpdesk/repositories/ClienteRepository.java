package com.reginaldo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reginaldo.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
