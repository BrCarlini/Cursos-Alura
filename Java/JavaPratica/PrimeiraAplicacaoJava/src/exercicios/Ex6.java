package exercicios;

public class Ex6 {
	
	/*
	 * Declare uma variável do tipo double precoOriginal.
	 * Atribua um valor em reais a essa variável, representando o preço original de um produto. 
	 * Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). 
	 * Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		double precoOriginal = 149.90;
		double percentualDesconto = 10;
		
		double valorDoDesconto = precoOriginal * (percentualDesconto / 100);
		
		double precoComDesconto = precoOriginal - valorDoDesconto;
		
		System.out.printf("Preço Original: R$%.2f\nValor do desconto: R$%.2f\nPreço com Desconto: R$%.2f", precoOriginal, valorDoDesconto, precoComDesconto);

	}

}
