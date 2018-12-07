package com.gerenciadorClin.brewer.repository.helper.cliente;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.gerenciadorClin.brewer.model.Cliente;
import com.gerenciadorClin.brewer.repository.filter.ClienteFilter;




public class ClientesImpl implements ClientesQueries{
	
	@PersistenceContext
	private EntityManager manager;

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> filtrar(ClienteFilter filtro) {
		Criteria criteria = manager.unwrap(Session.class).createCriteria(Cliente.class);
		if(filtro !=null) {
			if(!StringUtils.isEmpty(filtro.getNumCliente()));{
				criteria.add(Restrictions.eq("numCliente",filtro.getNumCliente()));
		}
		 }
		return criteria.list();	
	}

}
	