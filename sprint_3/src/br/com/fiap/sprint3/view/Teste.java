package br.com.fiap.sprint3.view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teste {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(dtf.format(now));
		
		String data = dtf.format(now).toString();
		String[] arrData = data.split(" ");
		System.out.println(arrData[0]);
		System.out.println(arrData[1]);
		
	}
}//class