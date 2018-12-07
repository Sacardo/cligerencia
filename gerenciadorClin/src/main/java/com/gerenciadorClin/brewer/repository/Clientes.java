package com.gerenciadorClin.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciadorClin.brewer.model.Cliente;
import com.gerenciadorClin.brewer.repository.helper.cliente.ClientesQueries;

@Repository
public interface Clientes extends JpaRepository<Cliente, Long>, ClientesQueries{
}
