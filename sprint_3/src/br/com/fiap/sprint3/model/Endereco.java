package br.com.fiap.sprint3.model;

public class Endereco {
	//Atributos
	private String idVinculo, logradouro, bairro, cidade, estado, cep;
	private int numero;
	
	//Construtor
	public Endereco(String idVinculo, String logradouro, String bairro, String cidade, String estado, String cep,
			int numero) {
		super();
		this.idVinculo = idVinculo;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
	}//Endereco
	
	//Getters
	public String getIdVinculo() {
		return idVinculo;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public String getCep() {
		return cep;
	}
	public int getNumero() {
		return numero;
	}
	
	//Setters
	public void setIdVinculo(String idVinculo) {
		this.idVinculo = idVinculo;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Métodos
	public String retornarInformacoes() {
		//private String idVinculo, logradouro, bairro, cidade, estado, cep;
		//private int numero;
		return "Logradouro: " + logradouro+ ", Número: " + numero + ", Bairro: " + bairro + ", Cidade: " 
				+ cidade + ", Estado: " + estado + ", CEP: " + cep;
	}// retornarInformacoes
	
	//toString
	@Override
	public String toString() {
		return "Endereco [idVinculo=" + idVinculo + ", logradouro=" + logradouro + ", numero=" + numero + "]";
	}
}//Endereco