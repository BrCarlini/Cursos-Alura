package br.com.magna.algoritmoCubo;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Thread representacaoCuboProblema = new Thread(new LeituraCuboTxt("AlgoritmoCuboProblema.txt"));
		Thread representacaoCuboSolucao = new Thread(new LeituraCuboTxt("AlgoritmoCuboSolucao.txt"));
		
		Solucao solucao = new Solucao();
		
		boolean flag = true;
		int menu;
		
		
		while(flag) {
			
			System.out.print("""
					
					
					
					1 - Ver problema.
					2 - Solução.
					3 - Sair
					
					>>>  """);
			menu = scn.nextInt();
			System.out.println();
			
			
			switch (menu) {
			case 1:
				System.out.println(" --> Dado uma distância do Ponto A ao Ponto B, calcule o menor caminho com base no cubo abaixo: ");
				
				
				try {
					representacaoCuboProblema.start();
					Thread.sleep(1000);
					break;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 2:
				representacaoCuboSolucao.start();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				solucao.mostraSolucao(6.0);
				
				
				break;
			case 3:
				System.out.println("Desafio encerrado.");
				flag = false;
				break;
				
			default:
				System.out.println("Valor inválido.");
			}
			
		}
		scn.close();
		
		

	}
	


}
