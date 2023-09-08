package br.com.fiap.sprint3.operator;

import java.util.HashMap;


import br.com.fiap.sprint3.model.Endereco;
import br.com.fiap.sprint3.model.Guincho;

public class SistemaDao {
	//Atributos
	HashMap<String, Endereco> enderecos;
	HashMap<String, Guincho> guinchos;

	//Construtor
	public SistemaDao() {
		super();
		this.enderecos = new HashMap<>();
		this.guinchos = new HashMap<>();
	}//SistemaDao

	public HashMap<String, Endereco> getEnderecos() {
		return enderecos;
	}

	public HashMap<String, Guincho> getGuinchos() {
		return guinchos;
	}

	public void setEnderecos(HashMap<String, Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public void setGuinchos(HashMap<String, Guincho> guinchos) {
		this.guinchos = guinchos;
	}


	
	//Métodos

	
	
	
}//CLASS