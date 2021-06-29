package com.crudbasico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudbasico.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
}