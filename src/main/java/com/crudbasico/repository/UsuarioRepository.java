package com.crudbasico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudbasico.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
