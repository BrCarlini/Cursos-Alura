package exercicios;

import java.util.Scanner;

public class Ex10 {
	
	/*
	 * Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
	 * 
	 * */
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int num = scn.nextInt();
		
		
		if(num % 2 == 0) {
			System.out.printf("O numero %d é par.", num);
		}else {
			System.out.printf("O numero %d é ímpar.", num);
		}
		
		scn.close();
				
	
	
	}

}
