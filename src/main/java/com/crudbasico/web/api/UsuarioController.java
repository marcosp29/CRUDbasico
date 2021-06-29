package com.crudbasico.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crudbasico.domain.Usuario;
import com.crudbasico.service.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService us;
	
	@PostMapping
	public Usuario criarNovoUsuario(
			@RequestParam(required = true) String email, 
			@RequestParam(required = true) String senha){
		
		if(email.contains("admin")) {
			return us.registraUsuarioAdmin(email, senha);
		}else {
			return us.registraUsuarioDefault(email, senha);
		}
	}

}
