package br.com.fiap.sprint3.model;

import java.util.HashMap;

public class Cliente {
	//Atributos
	private String nome,cpf,idCliente,dataNascimento,sexo,email,senha;
	private boolean statusLogin = false;
	private Endereco endereco;
	private PlanoDeSeguro planoDeSeguro;
	private HashMap<String, Chamado> chamados;
	private Caminhao veiculo;
	
	//Construtor
	public Cliente(String nome, String cpf, String idCliente, String dataNascimento, String sexo, String email,
			String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idCliente = idCliente;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.senha = senha;
		this.chamados = new HashMap<>();
	}//Cliente

	//Getters
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public boolean isStatusLogin() {
		return statusLogin;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public PlanoDeSeguro getPlanoDeSeguro() {
		return planoDeSeguro;
	}

	public HashMap<String, Chamado> getChamados() {
		return chamados;
	}

	public Caminhao getVeiculo() {
		return veiculo;
	}

	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setStatusLogin(boolean statusLogin) {
		this.statusLogin = statusLogin;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setPlanoDeSeguro(PlanoDeSeguro planoDeSeguro) {
		this.planoDeSeguro = planoDeSeguro;
	}

	public void setChamados(HashMap<String, Chamado> chamados) {
		this.chamados = chamados;
	}

	public void setVeiculo(Caminhao veiculo) {
		this.veiculo = veiculo;
	}
	
	//Métodos
	public String retornarInformacoes() {
		return "Nome: " + nome + ", CPF: " + cpf + ", Id: " + idCliente 
				+ ", Data Nascimento: " + dataNascimento + ", Sexo: " 
				+ sexo + ", Email: " + email + ", Senha: " + senha;
	}//retornarInformacoes

	//toString
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + "]";
	}
	
	
	
}//CLASS