package exercicios;

import java.util.Scanner;

public class Ex1 {
	/*
	 * Crie um programa que realize a média de duas notas decimais e exiba o resultado.
	 * */

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Informe a 1° Nota: ");
		double n1 = scn.nextDouble();
		
		System.out.print("Informe a 2° Nota: ");
		double n2 = scn.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		scn.close();
		
		System.out.printf("Nota 1: %.2f\nNota 2: %.2f\nMedia: %.2f", n1, n2, media);
	}

}
