package com.gerenciadorClin.brewer.thymelealf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.gerenciadorClin.brewer.thymelealf.processor.ClassForErrorAttributeTagProcessor;
import com.gerenciadorClin.brewer.thymelealf.processor.MessageElementTagProcessor;

public class BrewerDialect extends AbstractProcessorDialect{

	public BrewerDialect() {
		super("Gerencia Brewer", "brewer", StandardDialect.PROCESSOR_PRECEDENCE);
	}

	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor>processores = new HashSet<>();
		processores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
		processores.add(new MessageElementTagProcessor(dialectPrefix));
		return processores;
	}

}
