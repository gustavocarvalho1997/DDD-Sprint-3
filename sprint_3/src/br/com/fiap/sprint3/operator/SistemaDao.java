package br.com.fiap.sprint3.operator;

import java.util.HashMap;


import br.com.fiap.sprint3.model.Endereco;

public class SistemaDao {
	//Atributos
	HashMap<String, Endereco> enderecos;

	//Construtor
	public SistemaDao() {
		super();
		this.enderecos = new HashMap<>();
	}//SistemaDao

	public HashMap<String, Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(HashMap<String, Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	//Métodos

	
	
	
}//CLASS