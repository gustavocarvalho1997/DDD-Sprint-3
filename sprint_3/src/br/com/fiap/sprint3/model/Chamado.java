package br.com.fiap.sprint3.model;

public class Chamado {
	//Atributos
	private Endereco endereco;
	private Veiculo guinchoEscolhido;
	private boolean chamadoAtivo, chamadoPausado, chamadoFechado;
	private String idChamado, dataDaOcorrencia, horaDaOcorrencia, descricao, tipoGuincho, idVinculo;
	
	//Construtor
	public Chamado(boolean chamadoAtivo, boolean chamadoPausado, boolean chamadoFechado, String idChamado,
			String dataDaOcorrencia, String horaDaOcorrencia, String descricao, String tipoGuincho, String idVinculo) {
		super();
		this.chamadoAtivo = chamadoAtivo;
		this.chamadoPausado = chamadoPausado;
		this.chamadoFechado = chamadoFechado;
		this.idChamado = idChamado;
		this.dataDaOcorrencia = dataDaOcorrencia;
		this.horaDaOcorrencia = horaDaOcorrencia;
		this.descricao = descricao;
		this.tipoGuincho = tipoGuincho;
		this.idVinculo = idVinculo;
	}

	//Getters
	public Endereco getEndereco() {
		return endereco;
	}

	public Veiculo getGuinchoEscolhido() {
		return guinchoEscolhido;
	}

	public boolean isChamadoAtivo() {
		return chamadoAtivo;
	}

	public boolean isChamadoPausado() {
		return chamadoPausado;
	}

	public boolean isChamadoFechado() {
		return chamadoFechado;
	}

	public String getIdChamado() {
		return idChamado;
	}

	public String getDataDaOcorrencia() {
		return dataDaOcorrencia;
	}

	public String getHoraDaOcorrencia() {
		return horaDaOcorrencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getTipoGuincho() {
		return tipoGuincho;
	}

	public String getIdVinculo() {
		return idVinculo;
	}
	//Setters
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setGuinchoEscolhido(Veiculo guinchoEscolhido) {
		this.guinchoEscolhido = guinchoEscolhido;
	}

	public void setChamadoAtivo(boolean chamadoAtivo) {
		this.chamadoAtivo = chamadoAtivo;
	}

	public void setChamadoPausado(boolean chamadoPausado) {
		this.chamadoPausado = chamadoPausado;
	}

	public void setChamadoFechado(boolean chamadoFechado) {
		this.chamadoFechado = chamadoFechado;
	}

	public void setIdChamado(String idChamado) {
		this.idChamado = idChamado;
	}

	public void setDataDaOcorrencia(String dataDaOcorrencia) {
		this.dataDaOcorrencia = dataDaOcorrencia;
	}

	public void setHoraDaOcorrencia(String horaDaOcorrencia) {
		this.horaDaOcorrencia = horaDaOcorrencia;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setTipoGuincho(String tipoGuincho) {
		this.tipoGuincho = tipoGuincho;
	}

	public void setIdVinculo(String idVinculo) {
		this.idVinculo = idVinculo;
	}
	
	//Métodos
	public String retornarInformacoes() {
		return "Id do Chamado: " + idChamado + ", Descrição: " + descricao 
				+ ", Data: " + dataDaOcorrencia + ", Horário: " + horaDaOcorrencia
				+ ", Tipo de Guincho: " + tipoGuincho;
	}//retornarInformacoes

	//toString
	@Override
	public String toString() {
		return "Chamado [descricao=" + descricao + ", idChamado=" + idChamado + "]";
	}
}//CLASS