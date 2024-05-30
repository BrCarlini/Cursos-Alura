package br.com.magna.algoritmoCubo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraCuboTxt implements Runnable {

	String nomeDoArquivo;

	public LeituraCuboTxt(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
	}

	@Override
	public void run() {

		try {

			// diagonal do quadrado
			// Leitura do arquivo
			Scanner scanner = new Scanner(new File(nomeDoArquivo));

			
			

			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				
				
				System.out.println(linha);
				
			}

			scanner.close();

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		
		

	}

}
