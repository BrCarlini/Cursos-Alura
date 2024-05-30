package exercicios;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		double[] vPrimeiroTrimestre = new double[3];
		Scanner scn = new Scanner(System.in);
		int cont = 1;
		double total = 0.0;
		double media;
		
		
		//System.out.println(vPrimeiroTrimestre.length);
		
		// Adiciona o valor de cada mês do Trimestre
		for(int i = 0; i < vPrimeiroTrimestre.length; i++) {
			System.out.printf("Informe o %d° valor: ", cont++);
			int valor = scn.nextInt();
			vPrimeiroTrimestre[i] = valor;
		}
		
		// Soma o total de valores do Array
		for(int i = 0; i < vPrimeiroTrimestre.length; i++) {
			total += vPrimeiroTrimestre[i];
		}
		
		media = total / vPrimeiroTrimestre.length;
		
		System.out.printf("Total gasto: R$%.2f\n", total);
		
		System.out.printf("Media: R$%.2f\n", media);
		
		

	}

}
