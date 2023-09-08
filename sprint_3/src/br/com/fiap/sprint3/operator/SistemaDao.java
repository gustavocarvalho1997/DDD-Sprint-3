package br.com.fiap.sprint3.operator;

import java.util.HashMap;


import br.com.fiap.sprint3.model.Endereco;
import br.com.fiap.sprint3.model.Guincho;
import br.com.fiap.sprint3.model.PlanoDeSeguro;

public class SistemaDao {
	//Atributos
	HashMap<String, Endereco> enderecos;
	HashMap<String, Guincho> guinchos;
	HashMap<String, PlanoDeSeguro> planos;

	//Construtor
	public SistemaDao() {
		super();
		this.enderecos = new HashMap<>();
		this.guinchos = new HashMap<>();
		this.planos = new HashMap<>();
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

	public void setEnderecos(HashMap<String, Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public void setGuinchos(HashMap<String, Guincho> guinchos) {
		this.guinchos = guinchos;
	}

	public void setPlanos(HashMap<String, PlanoDeSeguro> planos) {
		this.planos = planos;
	}




	
	//Métodos

	
	
	
}//CLASS