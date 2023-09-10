package br.com.fiap.sprint3.operator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

import br.com.fiap.sprint3.model.Caminhao;
import br.com.fiap.sprint3.model.Chamado;
import br.com.fiap.sprint3.model.Cliente;
import br.com.fiap.sprint3.model.Endereco;
import br.com.fiap.sprint3.model.Guincho;
import br.com.fiap.sprint3.model.PlanoDeSeguro;

public class SistemaDao {
	//Atributos
	HashMap<String, Endereco> enderecos;
	HashMap<String, Guincho> guinchos;
	HashMap<String, PlanoDeSeguro> planos;
	HashMap<String, Caminhao> caminhoes;
	HashMap<String, Chamado> chamados;
	HashMap<String, Cliente> clientes;

	//Construtor
	public SistemaDao() {
		super();
		this.enderecos = new HashMap<>();
		this.guinchos = new HashMap<>();
		this.planos = new HashMap<>();
		this.caminhoes = new HashMap<>();
		this.chamados = new HashMap<>();
		this.clientes = new HashMap<>();
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

	public HashMap<String, Caminhao> getCaminhoes() {
		return caminhoes;
	}

	public HashMap<String, Chamado> getChamados() {
		return chamados;
	}

	public HashMap<String, Cliente> getClientes() {
		return clientes;
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

	public void setCaminhoes(HashMap<String, Caminhao> caminhoes) {
		this.caminhoes = caminhoes;
	}

	public void setChamados(HashMap<String, Chamado> chamados) {
		this.chamados = chamados;
	}

	public void setClientes(HashMap<String, Cliente> clientes) {
		this.clientes = clientes;
	}
	
	//Métodos
	public void logar(Cliente cliente) {
		cliente.setStatusLogin(true);
	}//Logar
	public void deslogar(Cliente cliente) {
		cliente.setStatusLogin(false);
	}//Deslogar
	public void imprimirInformacoes(Cliente cliente) {
		System.out.println(cliente.retornarInformacoes());
	}//imprimirInformacoes
	public void imprimirChamados(Cliente cliente) {
		Set<String> keys = cliente.getChamados().keySet();
		for(String item : keys) {
			System.out.println(cliente.getChamados().get(item).retornarInformacoes());
		}
	}//imprimirChamados
	public void alterarStatusChamado(Cliente cliente) {
		String chamadoKey = JOptionPane.showInputDialog("Informe o ID do chamado a ser alterado o status: ").toUpperCase();
		if(cliente.getChamados().containsKey(chamadoKey)) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite conforme sua opção desejada: \n1 - Para ativar chamado\n2 - Para pausar chamado\n3 - Para fechar chamado"));
			if(opcao == 1) {//ATIVAR CHAMADO
				boolean verificaAtivo = false;
				Set<String> keys = cliente.getChamados().keySet();
				for(String item : keys) {
					if(cliente.getChamados().get(item).isChamadoAtivo()) {
						verificaAtivo = true;
					}
				}
				if(verificaAtivo) {
					System.out.println("Você ja tem um chamado ativo no momento!");
				} else {
					if(cliente.getChamados().get(chamadoKey).isChamadoAtivo()) {
						System.out.println("Chamado ja se encontra ativo");
					} else {
						cliente.getChamados().get(chamadoKey).setChamadoAtivo(true);
						cliente.getChamados().get(chamadoKey).setChamadoPausado(false);
						cliente.getChamados().get(chamadoKey).setChamadoFechado(false);
						cliente.getChamados().get(chamadoKey).setStatus("Chamado Ativo");
						chamados.get(chamadoKey).setChamadoAtivo(true);
						chamados.get(chamadoKey).setChamadoPausado(false);
						chamados.get(chamadoKey).setChamadoFechado(false);
						chamados.get(chamadoKey).setStatus("Chamado Ativo");
						System.out.println("Chamado ativo com sucesso");
					}
				}
			} else if(opcao == 2) {//PAUSAR CHAMADO
				if(cliente.getChamados().get(chamadoKey).isChamadoPausado()) {
					System.out.println("Chamado ja se encontra pausado");
				} else {
					cliente.getChamados().get(chamadoKey).setChamadoAtivo(false);
					cliente.getChamados().get(chamadoKey).setChamadoPausado(true);
					cliente.getChamados().get(chamadoKey).setChamadoFechado(false);
					cliente.getChamados().get(chamadoKey).setStatus("Chamado Pausado");
					chamados.get(chamadoKey).setChamadoAtivo(false);
					chamados.get(chamadoKey).setChamadoPausado(true);
					chamados.get(chamadoKey).setChamadoFechado(false);
					chamados.get(chamadoKey).setStatus("Chamado Pausado");
					System.out.println("Chamado pausado com sucesso");
				}
			} else if(opcao == 3) {//FECHAR CHAMADO
				if(cliente.getChamados().get(chamadoKey).isChamadoFechado()) {
					System.out.println("Chamado ja se encontra fechado");
				} else {
					int opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o motivo do fechamando do chamado:\n1 - Para atendido com sucesso\n2 - Para efetuar o fechamando dele por cancelamento"));
					if(opcao2 == 1) {//FECHAR POR ATENDIDO COM SUCESSO
						cliente.getChamados().get(chamadoKey).setChamadoAtivo(false);
						cliente.getChamados().get(chamadoKey).setChamadoPausado(false);
						cliente.getChamados().get(chamadoKey).setChamadoFechado(true);
						cliente.getChamados().get(chamadoKey).setStatus("Chamado Atendido com sucesso");
						chamados.get(chamadoKey).setChamadoAtivo(false);
						chamados.get(chamadoKey).setChamadoPausado(false);
						chamados.get(chamadoKey).setChamadoFechado(true);
						chamados.get(chamadoKey).setStatus("Chamado Atendido com sucesso");
						System.out.println("Chamado fechado com sucesso");
					} else if(opcao2 == 2) {// FECHAR POR CANCELAMENTO
						cliente.getChamados().get(chamadoKey).setChamadoAtivo(false);
						cliente.getChamados().get(chamadoKey).setChamadoPausado(false);
						cliente.getChamados().get(chamadoKey).setChamadoFechado(true);
						cliente.getChamados().get(chamadoKey).setStatus("Chamado Cancelado");
						chamados.get(chamadoKey).setChamadoAtivo(false);
						chamados.get(chamadoKey).setChamadoPausado(false);
						chamados.get(chamadoKey).setChamadoFechado(true);
						chamados.get(chamadoKey).setStatus("Chamado Cancelado");
						System.out.println("Chamado fechado com sucesso");
					} else {
						System.out.println("Opção inválida");
					}
				}
			} else {
				System.out.println("Opção inválida");
			}
		} else {
			System.out.println("Chamado não localizado, favor verificar o ID.");
		}
	}//alterarStatusChamado
	
	public void consultaChamadoEspecifico(Cliente cliente) {
		String idChamado = JOptionPane.showInputDialog("Informe o ID do chamado a ser consultado:");
		if(cliente.getChamados().containsKey(idChamado)) {
			System.out.println(cliente.getChamados().get(idChamado).retornarInformacoes());
		} else {
			System.out.println("Chamado não localizado, favor verificar o ID.");
		}
	}//consultaChamadoEspecifico
	
	public ArrayList<String> retornaInformacoesMensagem(Cliente cliente){
		String nome = "Nome: " + cliente.getNome();
		String id = "Id Cliente: " + cliente.getIdCliente();
		String email = "Email: " + cliente.getEmail();
		String mensagem = "Mensagem: " + JOptionPane.showInputDialog("Escreva aqui sua mensagem: ");
		ArrayList<String> informacoesMensagem = new ArrayList<>();
		informacoesMensagem.add(0, nome);
		informacoesMensagem.add(1, id);
		informacoesMensagem.add(2, email);
		informacoesMensagem.add(3, mensagem);
		
		return informacoesMensagem;
	}//retornaInformacoesMensagem
	
	public void abrirChamado(Cliente cliente) {
		Random randI = new Random();
		boolean verificaAtivo = false;
		Set<String> keys = cliente.getChamados().keySet();
		for(String item : keys) {
			if(cliente.getChamados().get(item).isChamadoAtivo()) {
				verificaAtivo = true;
			}
		}//for
		if(verificaAtivo) {
			System.out.println("Você ja tem um chamado ativo no momento!");
		} else {
			String idEndereco = "";
			do {
				String prefixoEnd = "ED";
				int n = randI.nextInt(999999);
				idEndereco = prefixoEnd + n;
			} while (enderecos.containsKey(idEndereco));//ID ENDEREÇO DEF
			String idChamado = "";
			do {
				String prefixoChamado = "CH";
				int n = randI.nextInt(999999);
				idChamado = prefixoChamado + n;
			} while (chamados.containsKey(idChamado));//ID CHAMADO DEF
			String logradouro = JOptionPane.showInputDialog("Informe o logradouro da ocorrencia:");
			String bairro = JOptionPane.showInputDialog("Informe o bairro: ");
			String cidade = JOptionPane.showInputDialog("Informe a cidade: ");
			String estado = JOptionPane.showInputDialog("Informe o estado: ");
			String cep = JOptionPane.showInputDialog("Informe o CEP: ");
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
			//Instanciando endereço
			Endereco enderecoChamado = new Endereco(idEndereco, idChamado, logradouro, bairro, cidade, estado, cep, numero);
			//TÉRMINO INFORMAÇÕES ENDEREÇO
			//INICIO INFORMAÇÕES CHAMADO
			boolean chamadoAtivo = true;
			boolean chamadoPausado = false;
			boolean chamadoFechado = false;
			//idChamado ja definido acima
			//DEFININDO DATA E HORA
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			String[] arrDataHora = dtf.format(now).toString().split(" ");
			String dataDaOcorrencia = arrDataHora[0];
			String horaDaOcorrencia = arrDataHora[1];
			//FINALIZANDO DATA E HORA
			String descricao = JOptionPane.showInputDialog("Informe o que ocorreu: ");
			String tipoGuincho = "";
			if(cliente.getVeiculo().getPesoTotalEmToneladas() <= 10) {
				tipoGuincho = "Tipo A";
			} else {
				tipoGuincho = "Tipo B";
			}
			String idVinculo = cliente.getIdCliente();
			String Status = "Chamado Ativo";
			//Instanciando chamado
			Chamado chamado = new Chamado(chamadoAtivo, chamadoPausado, chamadoFechado, idChamado, dataDaOcorrencia, horaDaOcorrencia, descricao, tipoGuincho, idVinculo, Status);
			//Vinculando guincho
			Set<String> keysGuincho = guinchos.keySet();
			for(String item : keysGuincho) {
				if(guinchos.get(item).getTipo().equalsIgnoreCase(chamado.getTipoGuincho())) {
					chamado.setGuinchoEscolhido(guinchos.get(item));
				}
			}//Vinculo guincho
			chamado.setEndereco(enderecoChamado);
			//Objetos criados por completo
			//Armazenando nas Hash
			enderecos.put(idEndereco, enderecoChamado);
			chamados.put(idChamado, chamado);
			cliente.getChamados().put(idChamado, chamado);
			System.out.println("Chamado aberto com sucesso!");
		}//ELSE
	}//abrirChamado

	
	
	
}//CLASS