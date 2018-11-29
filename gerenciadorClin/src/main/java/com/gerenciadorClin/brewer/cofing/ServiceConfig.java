package com.gerenciadorClin.brewer.cofing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gerenciadorClin.brewer.service.cadastroClienteService;

@Configuration
@ComponentScan(basePackageClasses= cadastroClienteService.class)
public class ServiceConfig {

}
