package exercicios.Aluno;

public class Aluno {
	/*
	 * Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
	 * Crie uma instância da classe Aluno, 
	 * atribua valores aos seus atributos e utilize o método para exibir as informações.
	 * 
	 * */
	
	String nome;
	int idade;
	
	void exibeInfoAluno() {
		System.out.printf("""
				Nome:    %s
				Idade:   %d
				""", nome, idade);
	}
	
	

}
