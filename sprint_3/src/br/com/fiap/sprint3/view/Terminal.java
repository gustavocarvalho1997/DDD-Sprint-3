package br.com.fiap.sprint3.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import br.com.fiap.sprint3.model.Caminhao;
import br.com.fiap.sprint3.model.Chamado;
import br.com.fiap.sprint3.model.Endereco;
import br.com.fiap.sprint3.model.Guincho;
import br.com.fiap.sprint3.model.PlanoDeSeguro;
import br.com.fiap.sprint3.operator.SistemaDao;

public class Terminal {
	public static void main(String[] args) {
		SistemaDao sist = new SistemaDao();
		try {
			FileReader inputStreamEnderecos = new FileReader("Enderecos.txt");
			BufferedReader arquivoEntradaEnderecos = new BufferedReader(inputStreamEnderecos);
			
			FileReader inputStreamGuinchos = new FileReader("Guincho.txt");
			BufferedReader arquivoEntradaGuinchos = new BufferedReader(inputStreamGuinchos);
			
			FileReader inputStreamPlanos = new FileReader("PlanoDeSeguro.txt");
			BufferedReader arquivoEntradaPlanos = new BufferedReader(inputStreamPlanos);
			
			FileReader inputStreamCaminhoes = new FileReader("Caminhao.txt");
			BufferedReader arquivoEntradaCaminhoes = new BufferedReader(inputStreamCaminhoes);
			
			FileReader inputStreamChamados = new FileReader("Chamado.txt");
			BufferedReader arquivoEntradaChamados = new BufferedReader(inputStreamChamados);
			
			String linhaEnderecos;
			while((linhaEnderecos = arquivoEntradaEnderecos.readLine()) != null) {
				String[] arrEndereco = linhaEnderecos.split(",");
				
				String idEndereco = arrEndereco[0];
				String idVinculo = arrEndereco[1];
				String logradouro = arrEndereco[2];
				String bairro = arrEndereco[3];
				String cidade = arrEndereco[4];
				String estado = arrEndereco[5];
				String cep = arrEndereco[6];
				int numero = Integer.parseInt(arrEndereco[7]);
				
				sist.getEnderecos().put(idEndereco, new Endereco(idEndereco, idVinculo, logradouro, bairro, cidade, estado, cep, numero));
				
			}
			String linhaGuincho;
			while((linhaGuincho = arquivoEntradaGuinchos.readLine()) != null) {
				String[] arrGuinchos = linhaGuincho.split(",");
				
				String modelo = arrGuinchos[0];
				String chassi = arrGuinchos[1];
				String renavam = arrGuinchos[2];
				String cor = arrGuinchos[3];
				int ano = Integer.parseInt(arrGuinchos[4]);
				double altura = Double.parseDouble(arrGuinchos[5]);
				double comprimento = Double.parseDouble(arrGuinchos[6]);
				double largura = Double.parseDouble(arrGuinchos[7]);
				double cargaMaximaEmToneladas = Double.parseDouble(arrGuinchos[8]);
				double comprimentoMaximo = Double.parseDouble(arrGuinchos[9]);
				String informacoesAdicionais = arrGuinchos[10];
				String tipo = arrGuinchos[11];
				
				sist.getGuinchos().put(chassi, new Guincho(modelo, chassi, renavam, cor, ano, altura, comprimento, largura, cargaMaximaEmToneladas, comprimentoMaximo, informacoesAdicionais, tipo));
			}
			
			String linhaPlanos;
			while((linhaPlanos = arquivoEntradaPlanos.readLine()) != null) {
				String[] arrPlanos = linhaPlanos.split(",");
				
				String idSeguro = arrPlanos[0];
				String tipoDeSeguro = arrPlanos[1];
				String coberturas = arrPlanos[2];
				String dataDaContratacao = arrPlanos[3];
				String idVinculo = arrPlanos[4];
				
				sist.getPlanos().put(idSeguro, new PlanoDeSeguro(idSeguro, tipoDeSeguro, coberturas, dataDaContratacao, idVinculo));
			}
			
			String linhaCaminhoes;
			while((linhaCaminhoes = arquivoEntradaCaminhoes.readLine()) != null) {
				String[] arrCaminhoes = linhaCaminhoes.split(",");
				
				String modelo = arrCaminhoes[0];
				String chassi = arrCaminhoes[1]; 
				String renavam = arrCaminhoes[2];
				String cor = arrCaminhoes[3];
				int ano = Integer.parseInt(arrCaminhoes[4]);
				double altura = Double.parseDouble(arrCaminhoes[5]);
				double comprimento = Double.parseDouble(arrCaminhoes[6]);
				double largura = Double.parseDouble(arrCaminhoes[7]);
				int numeroDeEixos = Integer.parseInt(arrCaminhoes[8]);
				double pesoTotalEmToneladas = Double.parseDouble(arrCaminhoes[9]);
				String idVinculo = arrCaminhoes[10];
				
				sist.getCaminhoes().put(chassi, new Caminhao(modelo, chassi, renavam, cor, ano, altura, comprimento, largura, numeroDeEixos, pesoTotalEmToneladas, idVinculo));
			}
			
			String linhaChamados;
			while((linhaChamados = arquivoEntradaChamados.readLine()) != null) {
				String[] arrChamados = linhaChamados.split(",");
				
				boolean chamadoAtivo = Boolean.parseBoolean(arrChamados[0]);
				boolean chamadoPausado = Boolean.parseBoolean(arrChamados[1]);
				boolean chamadoFechado = Boolean.parseBoolean(arrChamados[2]);
				String idChamado = arrChamados[3];
				String dataDaOcorrencia = arrChamados[4];
				String horaDaOcorrencia = arrChamados[5];
				String descricao = arrChamados[6];
				String tipoGuincho = arrChamados[7];
				String idVinculo = arrChamados[8];
				String status = arrChamados[9];
				
				Chamado c = new Chamado(chamadoAtivo, chamadoPausado, chamadoFechado, idChamado, dataDaOcorrencia, horaDaOcorrencia, descricao, tipoGuincho, idVinculo, status);
				Set<String> keysEnd = sist.getEnderecos().keySet();
				for(String item : keysEnd) {
					if(sist.getEnderecos().get(item).getIdVinculo().equalsIgnoreCase(c.getIdChamado())) {
						c.setEndereco(sist.getEnderecos().get(item));
					}
				}//Vinculando Endereço
				
				Set<String> keysGuincho = sist.getGuinchos().keySet();
				for(String item : keysGuincho) {
					if(sist.getGuinchos().get(item).getTipo().equalsIgnoreCase(c.getTipoGuincho())) {
						c.setGuinchoEscolhido(sist.getGuinchos().get(item));
					}
				}//Vinculando Guincho
				
				sist.getChamados().put(idChamado, c);
				
			
			}
			
			System.out.println(sist.getEnderecos());
			System.out.println(sist.getGuinchos());
			System.out.println(sist.getPlanos());
			System.out.println(sist.getCaminhoes());
			System.out.println(sist.getChamados());
			System.out.println(sist.getChamados().get("CH112233").getGuinchoEscolhido());
			System.out.println(sist.getChamados().get("CH445566").getGuinchoEscolhido());
			
			arquivoEntradaEnderecos.close();
			arquivoEntradaGuinchos.close();
			arquivoEntradaPlanos.close();
			arquivoEntradaCaminhoes.close();
			arquivoEntradaChamados.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}//MAIN
}//CLASS