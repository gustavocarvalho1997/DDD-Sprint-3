package br.com.fiap.sprint3.operator;

import java.util.HashMap;

import br.com.fiap.sprint3.model.Caminhao;
import br.com.fiap.sprint3.model.Chamado;
import br.com.fiap.sprint3.model.Cliente;
import br.com.fiap.sprint3.model.Endereco;
import br.com.fiap.sprint3.model.Guincho;
import br.com.fiap.sprint3.model.PlanoDeSeguro;

public class SistemaDao {
	//Atributos
	HashMap<String, Endereco> enderecos;
	HashMap<String, Guincho> guinchos;
	HashMap<String, PlanoDeSeguro> planos;
	HashMap<String, Caminhao> caminhoes;
	HashMap<String, Chamado> chamados;
	HashMap<String, Cliente> clientes;

	//Construtor
	public SistemaDao() {
		super();
		this.enderecos = new HashMap<>();
		this.guinchos = new HashMap<>();
		this.planos = new HashMap<>();
		this.caminhoes = new HashMap<>();
		this.chamados = new HashMap<>();
		this.clientes = new HashMap<>();
	}//SistemaDao

	public HashMap<String, Endereco> getEnderecos() {
		return enderecos;
	}

	public HashMap<String, Guincho> getGuinchos() {
		return guinchos;
	}

	public HashMap<String, PlanoDeSeguro> getPlanos() {
		return planos;
	}

	public HashMap<String, Caminhao> getCaminhoes() {
		return caminhoes;
	}

	public HashMap<String, Chamado> getChamados() {
		return chamados;
	}

	public HashMap<String, Cliente> getClientes() {
		return clientes;
	}

	public void setEnderecos(HashMap<String, Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public void setGuinchos(HashMap<String, Guincho> guinchos) {
		this.guinchos = guinchos;
	}

	public void setPlanos(HashMap<String, PlanoDeSeguro> planos) {
		this.planos = planos;
	}

	public void setCaminhoes(HashMap<String, Caminhao> caminhoes) {
		this.caminhoes = caminhoes;
	}

	public void setChamados(HashMap<String, Chamado> chamados) {
		this.chamados = chamados;
	}

	public void setClientes(HashMap<String, Cliente> clientes) {
		this.clientes = clientes;
	}
	
	//Métodos
	public void logar(Cliente cliente) {
		cliente.setStatusLogin(true);
	}//Logar
	public void deslogar(Cliente cliente) {
		cliente.setStatusLogin(false);
	}//Deslogar

	
	
	
}//CLASS