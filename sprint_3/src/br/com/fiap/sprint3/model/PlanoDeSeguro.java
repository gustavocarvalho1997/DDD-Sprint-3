package br.com.fiap.sprint3.model;

public class PlanoDeSeguro {
	//Atributos
	private String idSeguro, tipoDeSeguro, coberturas, dataDaContratacao, idVinculo;

	//Construtor
	public PlanoDeSeguro(String idSeguro, String tipoDeSeguro, String coberturas, String dataDaContratacao,
			String idVinculo) {
		super();
		this.idSeguro = idSeguro;
		this.tipoDeSeguro = tipoDeSeguro;
		this.coberturas = coberturas;
		this.dataDaContratacao = dataDaContratacao;
		this.idVinculo = idVinculo;
	}//PlanoDeSeguro
	
	//Getters
	public String getIdSeguro() {
		return idSeguro;
	}

	public String getTipoDeSeguro() {
		return tipoDeSeguro;
	}

	public String getCoberturas() {
		return coberturas;
	}

	public String getDataDaContratacao() {
		return dataDaContratacao;
	}

	public String getIdVinculo() {
		return idVinculo;
	}

	//Setters
	public void setIdSeguro(String idSeguro) {
		this.idSeguro = idSeguro;
	}

	public void setTipoDeSeguro(String tipoDeSeguro) {
		this.tipoDeSeguro = tipoDeSeguro;
	}

	public void setCoberturas(String coberturas) {
		this.coberturas = coberturas;
	}

	public void setDataDaContratacao(String dataDaContratacao) {
		this.dataDaContratacao = dataDaContratacao;
	}

	public void setIdVinculo(String idVinculo) {
		this.idVinculo = idVinculo;
	}
	
	//Métodos
	public String retornarInformacoes() {
		return "IdSeguro: " + idSeguro + ", Tipo de Seguro: " + tipoDeSeguro 
				+ ", Coberturas: " + coberturas + ", Data da Contratação: " 
				+ dataDaContratacao;
	}//retornarInformacoes

	//toString
	@Override
	public String toString() {
		return "PlanoDeSeguro [idSeguro=" + idSeguro + ", tipoDeSeguro=" + tipoDeSeguro + ", coberturas=" + coberturas
				+ ", dataDaContratacao=" + dataDaContratacao + "]";
	}
	
	
	
}//CLASS