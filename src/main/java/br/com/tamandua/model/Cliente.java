package br.com.tamandua.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Cliente  {

	@Id
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private short status;

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public short getStatus() {
		return this.status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

}
