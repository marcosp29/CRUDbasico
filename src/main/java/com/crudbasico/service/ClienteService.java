package com.crudbasico.service;

import javax.persistence.EntityNotFoundException;

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
	
	public Cliente update(Integer id, Cliente updateCliente) {
		
		return repo.findById(id)
				.map(cliente -> {
					cliente.setNome(updateCliente.getNome());
					cliente.setCpf(updateCliente.getCpf());
					cliente.setEndereco(updateCliente.getEndereco());
					cliente.setTelefoneResidencial(updateCliente.getTelefoneResidencial());
					cliente.setTelefoneComercial(updateCliente.getTelefoneComercial());
					cliente.setTelefoneCelular(updateCliente.getTelefoneCelular());
					cliente.setEmail(updateCliente.getEmail());
					
					return repo.save(cliente);
					
				})
				.orElseThrow(() -> new EntityNotFoundException());
		
	}
	
	public void deleteCliente(Integer id) {
		repo.deleteById(id);
	}

}
