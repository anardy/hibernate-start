package br.com.tamandua.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.tamandua.connection.Connection;
import br.com.tamandua.model.Cliente;

public class ClienteDAO {
	
	private final Session session;
	
	public ClienteDAO() {
		this.session = Connection.getSession();
	}

	public void salva(Cliente cliente) {
		Transaction tx = session.beginTransaction();
		session.save(cliente);
		tx.commit();
	}
	
}
