package br.com.fiap.sprint3.model;

public class Caminhao extends Veiculo{
	//Atributos
	private int numeroDeEixos;
	private double pesoTotalEmToneladas;
	private String idVinculo;
	
	//Construtor
	public Caminhao(String modelo, String chassi, String renavam, String cor, int ano, double altura,
			double comprimento, double largura, int numeroDeEixos, double pesoTotalEmToneladas, String idVinculo) {
		super(modelo, chassi, renavam, cor, ano, altura, comprimento, largura);
		this.numeroDeEixos = numeroDeEixos;
		this.pesoTotalEmToneladas = pesoTotalEmToneladas;
		this.idVinculo = idVinculo;
	}//Caminhao

	//Getters
	public int getNumeroDeEixos() {
		return numeroDeEixos;
	}

	public double getPesoTotalEmToneladas() {
		return pesoTotalEmToneladas;
	}

	public String getIdVinculo() {
		return idVinculo;
	}

	//Setters
	public void setNumeroDeEixos(int numeroDeEixos) {
		this.numeroDeEixos = numeroDeEixos;
	}

	public void setPesoTotalEmToneladas(double pesoTotalEmToneladas) {
		this.pesoTotalEmToneladas = pesoTotalEmToneladas;
	}

	public void setIdVinculo(String idVinculo) {
		this.idVinculo = idVinculo;
	}
	
	//Métodos
	@Override
	public String retornarInformacoes() {
		return super.retornarInformacoes() + ", Numero de Eixos: " + numeroDeEixos
				+ ", Peso Total: " + pesoTotalEmToneladas;
	}//retornarInformacoes
	public String formatoSalvamento() {
		return modelo + "," + chassi + "," + renavam + "," + cor + ","
				+ ano + "," + altura + "," + comprimento + "," + largura
				+ "," + numeroDeEixos + "," + pesoTotalEmToneladas + "," + idVinculo;
	}//formatoSalvamento
	
}//CLASS