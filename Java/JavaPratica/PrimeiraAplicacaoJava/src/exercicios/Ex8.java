package exercicios;

import java.util.Scanner;

public class Ex8 {
	/*
	 * Crie um programa que solicite ao usuário digitar um número. 
	 * Se o número for positivo, exiba "Número positivo", caso contrário, 
	 * exiba "Número negativo".
	 * 
	 * */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		double num = scn.nextDouble();
		
		if(num > 0) {
			System.out.println("Numero positivo");
		}else if(num == 0) {
			System.out.println("Numero neutro");
		}else {
			System.out.println("Numero negativo");
		}
		
		
		scn.close();
	}

}
