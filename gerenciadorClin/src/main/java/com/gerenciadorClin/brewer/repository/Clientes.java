package com.gerenciadorClin.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Clientes extends JpaRepository<Clientes, Long>{

}
