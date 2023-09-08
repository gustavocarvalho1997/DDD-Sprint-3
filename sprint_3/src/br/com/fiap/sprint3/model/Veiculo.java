package br.com.fiap.sprint3.model;

public class Veiculo {
	//Atributos
	protected String modelo,chassi,renavam,cor;
	protected int ano;
	protected double altura, comprimento,largura;
	
	//Construtor
	public Veiculo(String modelo, String chassi, String renavam, String cor, int ano, double altura, double comprimento,
			double largura) {
		super();
		this.modelo = modelo;
		this.chassi = chassi;
		this.renavam = renavam;
		this.cor = cor;
		this.ano = ano;
		this.altura = altura;
		this.comprimento = comprimento;
		this.largura = largura;
	}//Veiculo
	
	//Getters
	public String getModelo() {
		return modelo;
	}
	public String getChassi() {
		return chassi;
	}
	public String getRenavam() {
		return renavam;
	}
	public String getCor() {
		return cor;
	}
	public int getAno() {
		return ano;
	}
	public double getAltura() {
		return altura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public double getLargura() {
		return largura;
	}
	
	//Setters
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	//Métodos
	public String retornarInformacoes() {
		return "Modelo: " + modelo + ", Chassi: " + chassi + ", Ano: " + ano 
				+ ", Renavam: " + renavam + ", Cor: " + cor + ", Altura:" + altura
				+ ", Comprimento: " + comprimento + ", Largura: " + largura;
	}//retornarInformacoes
	
	//toString
	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + "]";
	}
}//CLASS