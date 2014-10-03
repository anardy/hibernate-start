package br.com.tamandua;

import br.com.tamandua.dao.ClienteDAO;
import br.com.tamandua.model.Cliente;

public class Execute {

	public static void main(String[] args) {
		
		Cliente cliente = criaCliente();
		
		new ClienteDAO().salva(cliente);
				
	}

	private static Cliente criaCliente() {
		Cliente cliente = new Cliente();
		cliente.setCpf("948394394");
		cliente.setNome("Andre");
		cliente.setEndereco("Rua andre");
		cliente.setStatus((short) 1);
		cliente.setTelefone("235564");
		return cliente;
	}

}
