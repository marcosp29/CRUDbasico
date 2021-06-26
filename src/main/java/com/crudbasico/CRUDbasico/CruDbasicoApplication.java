package com.crudbasico.CRUDbasico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import com.crudbasico.service.UsuarioService;

@SpringBootApplication
@RestController
@ComponentScan("com.crudbasico.service")
public class CruDbasicoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CruDbasicoApplication.class, args);
		
		UsuarioService usuService = context.getBean(UsuarioService.class);
		usuService.registraUsuarioAdmin("admin@crudbasico.com", "123456");
		usuService.registraUsuarioDefault("user@crudbasico.com", "123456");
	}

}
