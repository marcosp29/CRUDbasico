package com.crudbasico.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.crudbasico.domain.Cliente;
import com.crudbasico.domain.Endereco;
import com.crudbasico.service.ClienteService;

public class ClienteController {
	
	@Autowired
	private ClienteService cs;
	
	@PostMapping
	Cliente registraNovoCliente(
			@RequestParam(required = true) String nome, 
			@RequestParam(required = true) Integer cpf,
			@RequestParam(required = true) Endereco endereco,
			@RequestParam(required = true) Integer telefoneCelular, 
			@RequestParam(required = true) String email){
		
		return cs.registraCliente(nome, cpf, endereco, null, null, telefoneCelular, email);
		
	}
	
	@PutMapping("/{id}")
	Cliente updateCliente(
			@PathVariable Integer id, 
			@RequestBody Cliente novoCliente) {
		
		return cs.update(id, novoCliente);
		
	}
	
	@DeleteMapping("/{id)")
	void deleteCliente(@PathVariable Integer id) {
		cs.deleteCliente(id);
	}
	
}
