package exercicios;

import java.util.Scanner;

public class Ex5 {

	/*
	 * Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. 
	 * Considere que o valor de 1 dólar é equivalente a 4.94 reais. 
	 * Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
	 * 
	 * */
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe o valor em dolar: ");
		double valorEmDolares = scn.nextFloat();
		double cotacaoAtual = 4.94;
		
		double valorEmReal = valorEmDolares * cotacaoAtual;
		
		System.out.printf("Valor em dolar: $%.2f\nValor em real: R$%.2f", valorEmDolares, valorEmReal);

		scn.close();
	}

}
