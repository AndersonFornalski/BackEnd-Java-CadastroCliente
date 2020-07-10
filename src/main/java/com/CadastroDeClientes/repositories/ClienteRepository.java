package com.CadastroDeClientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CadastroDeClientes.model.Cliente;

public interface ClienteRepository extends JpaRepository< Cliente, Long>{

}
