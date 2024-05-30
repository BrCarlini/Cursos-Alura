package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {
	/*
	 * Crie um programa que simula um jogo de adivinhação, que deve gerar um número 
	 * aleatório entre 0 e 100 
	 * e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. 
	 * A cada tentativa, o programa deve informar se o número digitado pelo usuário é 
	 * maior ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println("===== JOGO DA ADVINHAÇÃO =====");
		System.out.println("==============================");
		
		int numAleatorio = new Random().nextInt(100);
		Scanner scn = new Scanner(System.in);
		System.out.println("Advinnhe qual é esse numero: *** ");
		
		int tentativas = 5;
		
		do {
			System.out.println("==============================");
			System.out.print("INFORME UM NUMERO: ");
			int numUsuario = scn.nextInt();
			
			if(numUsuario == numAleatorio) {
				System.out.println("==============================");
				System.out.println("====== Você acertou !!! ======");
				System.out.println("==============================");
				System.out.println("============= WIN ============");
				System.out.println("==============================");
				break;
				
			}else {
				System.out.println("==============================");
				System.out.println("Você errou !!!");
				
				if(numAleatorio > numUsuario) {
					System.out.println("DICA: Chute mais alto.");
				}else {
					System.out.println("DICA: Chute mais baixo.");
				}
				
				tentativas--;
				System.out.println("Tentativas restantes: " + tentativas);
				
				if(tentativas == 0) {
					System.out.println("==============================");
					System.out.println("========== GAME OVER =========");
					System.out.println("==============================");
					
					
				}
				
			}
			
			
			
			
			
		}while(tentativas > 0);
		
		
		
		scn.close();

	}

}
