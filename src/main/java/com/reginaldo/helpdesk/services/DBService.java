package com.reginaldo.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reginaldo.helpdesk.domain.Chamado;
import com.reginaldo.helpdesk.domain.Cliente;
import com.reginaldo.helpdesk.domain.Tecnico;
import com.reginaldo.helpdesk.domain.enums.Perfil;
import com.reginaldo.helpdesk.domain.enums.Prioridade;
import com.reginaldo.helpdesk.domain.enums.Status;
import com.reginaldo.helpdesk.repositories.ChamadoRepository;
import com.reginaldo.helpdesk.repositories.ClienteRepository;
import com.reginaldo.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instaciaDB() {

		Tecnico tec1 = new Tecnico(null, "Reginaldo Campelo", "30093406053", "reginaldo@mail.com", "masterkey");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "João Guilherme", "75519760004", "guilherme@mail.com", "sisco12!@");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
