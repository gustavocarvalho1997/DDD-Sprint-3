package br.com.fiap.sprint3.model;

public class Guincho extends Veiculo{
	//Atributos
	private double cargaMaximaEmToneladas, ComprimentoMaximo;
	private String informacoesAdicionais, tipo;
	
	//Construtor
	public Guincho(String modelo, String chassi, String renavam, String cor, int ano, double altura, double comprimento,
			double largura, double cargaMaximaEmToneladas, double comprimentoMaximo, String informacoesAdicionais,
			String tipo) {
		super(modelo, chassi, renavam, cor, ano, altura, comprimento, largura);
		this.cargaMaximaEmToneladas = cargaMaximaEmToneladas;
		ComprimentoMaximo = comprimentoMaximo;
		this.informacoesAdicionais = informacoesAdicionais;
		this.tipo = tipo;
	}//Guincho

	//Getters
	public double getCargaMaximaEmToneladas() {
		return cargaMaximaEmToneladas;
	}

	public double getComprimentoMaximo() {
		return ComprimentoMaximo;
	}

	public String getInformacoesAdicionais() {
		return informacoesAdicionais;
	}

	public String getTipo() {
		return tipo;
	}

	//Setters
	public void setCargaMaximaEmToneladas(double cargaMaximaEmToneladas) {
		this.cargaMaximaEmToneladas = cargaMaximaEmToneladas;
	}

	public void setComprimentoMaximo(double comprimentoMaximo) {
		ComprimentoMaximo = comprimentoMaximo;
	}

	public void setInformacoesAdicionais(String informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Métodos
	@Override
	public String retornarInformacoes() {
		return super.retornarInformacoes() + ", Carga Máxima: " + cargaMaximaEmToneladas 
				+ " toneladas, Comprimento Máximo: " + ComprimentoMaximo 
				+ ", Tipo: " + tipo + ", Informações Adicionais: " + informacoesAdicionais;
	}//retornarInformacoes
	public String formatoSalvamento() {
		return modelo + "," + chassi + "," + renavam + "," + cor + "," + ano 
				+ "," + altura + "," + comprimento + "," + largura + "," 
				+ cargaMaximaEmToneladas + "," + ComprimentoMaximo + "," + informacoesAdicionais
				+ "," + tipo;
	}//formatoSalvamento
}//CLASS