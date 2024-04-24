package exercicios;

import java.util.Scanner;

public class Ex9 {

	/*
	 * Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
	 * */
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("De qual numero você gostaria de ver a Tabuada ? ");
		int tabuadaDo = scn.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", tabuadaDo, i, tabuadaDo * i);
		}
		
		scn.close();
		
	}
	
}
