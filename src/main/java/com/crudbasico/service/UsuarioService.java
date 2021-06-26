package com.crudbasico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.crudbasico.domain.Usuario;
import com.crudbasico.domain.UsuarioRole;
import com.crudbasico.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public Usuario registraUsuarioDefault(String email, String senha) {
		Usuario usuario = new Usuario();
		usuario.setEmail(email);
		usuario.setSenha(passwordEncoder.encode(senha));
		usuario.setRole(UsuarioRole.ROLE_DEFAULT);
		
//		if (repo.findByEmail(usuario.getEmail()).isPresent())
//			throw new UsuarioException("Já existe um usuário com este e-mail");
			
		return repo.save(usuario);
		
	}
	
	public Usuario registraUsuarioAdmin(String email, String senha) {
		Usuario usuario = new Usuario();
		usuario.setEmail(email);
		usuario.setSenha(passwordEncoder.encode(senha));
		usuario.setRole(UsuarioRole.ROLE_ADMIN);
		
//		if (repo.findByEmail(usuario.getEmail()).isPresent())
//			throw new UsuarioException("Já existe um usuário com este e-mail");
			
		return repo.save(usuario);
		
	}
	

}
