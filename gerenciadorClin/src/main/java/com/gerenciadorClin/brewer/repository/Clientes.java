package com.gerenciadorClin.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciadorClin.brewer.model.Cliente;

@Repository
public interface Clientes extends JpaRepository<Cliente, Long>{

}
