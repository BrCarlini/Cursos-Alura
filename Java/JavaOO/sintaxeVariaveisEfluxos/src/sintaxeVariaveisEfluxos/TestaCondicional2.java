package sintaxeVariaveisEfluxos;

public class TestaCondicional2 {

	
	public static void main(String[] args) {

		System.out.println("Testando condicionais: "); // sysout Ctrl + espaço para fazer auto complete

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("Infelizmente acesso negado");
		}

	}

}
