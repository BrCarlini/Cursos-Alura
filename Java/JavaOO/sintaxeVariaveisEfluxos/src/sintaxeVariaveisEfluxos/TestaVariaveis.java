package sintaxeVariaveisEfluxos;

public class TestaVariaveis {
	
	
	public static void main(String[] args) {
		System.out.println("ola novo teste");
		
		int idade;
		idade = 37;
		int outraIdade = 40;
		int somaIdades = idade + outraIdade;
		
		
		
		double notaPrimeiroBimestre = 7.7;
		double notaSegundoBimestre = 5.5;
		double notaTerceiroBimestre = 6.3;
		double notaQuartoBimestre = 5.0;
		double mediaDaNotaAnual = (notaPrimeiroBimestre + notaSegundoBimestre + notaTerceiroBimestre + notaQuartoBimestre) / 4;
		double testeDivisao = 5 / 2;
		double testeDivisao2 = 5 / 2.0;
		
		
		
		String nome = "Bruno";
		
		
		
		
		System.out.println(idade);
		System.out.println(outraIdade);
		System.out.println(somaIdades);
		System.out.println("Nome: " + nome);
		System.out.println("Media: " + mediaDaNotaAnual);
		System.out.println("Teste Divisao 1: " + testeDivisao);
		System.out.println("Teste Divisao 2: " + testeDivisao2);
	}

}
