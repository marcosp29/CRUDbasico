package com.crudbasico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudbasico.domain.Cliente;
import com.crudbasico.domain.Endereco;
import com.crudbasico.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	
	public Cliente registraCliente (String nome, Integer cpf, Endereco endereco,
			Integer telefoneResidencial, Integer telefoneComercial,
			Integer telefoneCelular, String email) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEndereco(endereco);
		cliente.setTelefoneResidencial(telefoneResidencial);
		cliente.setTelefoneComercial(telefoneComercial);
		cliente.setTelefoneCelular(telefoneCelular);
		cliente.setEmail(email);
		
		return repo.save(cliente);
	}

}
