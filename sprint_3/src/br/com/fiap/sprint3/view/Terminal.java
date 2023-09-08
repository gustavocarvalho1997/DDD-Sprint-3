package br.com.fiap.sprint3.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import br.com.fiap.sprint3.model.Endereco;
import br.com.fiap.sprint3.operator.SistemaDao;

public class Terminal {
	public static void main(String[] args) {
		SistemaDao sist = new SistemaDao();
		try {
			FileReader inputStreamEnderecos = new FileReader("Enderecos.txt");
			BufferedReader arquivoEntradaEnderecos = new BufferedReader(inputStreamEnderecos);
			
			String linhaEnderecos;
			while((linhaEnderecos = arquivoEntradaEnderecos.readLine()) != null) {
				String[] arrEndereco = linhaEnderecos.split(",");
				//(String idVinculo, String logradouro, String bairro, 
				//String cidade, String estado, String cep,
				//int numero)
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
			
			System.out.println(sist.getEnderecos());
			
			arquivoEntradaEnderecos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}//MAIN
}//CLASS