package br.com.fiap.sprint3.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import br.com.fiap.sprint3.model.Caminhao;
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
			
			System.out.println(sist.getEnderecos());
			System.out.println(sist.getGuinchos());
			System.out.println(sist.getPlanos());
			System.out.println(sist.getCaminhoes());
			
			arquivoEntradaEnderecos.close();
			arquivoEntradaGuinchos.close();
			arquivoEntradaPlanos.close();
			arquivoEntradaCaminhoes.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}//MAIN
}//CLASS