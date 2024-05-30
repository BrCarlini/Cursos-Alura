package exerciciosPoo.exPessoa;

public class Pessoa {
	String nome;
	int idade;
	
	String getNome() {
		return this.nome;
	}
	
	int getIdade() {
		return this.idade;
	}
	
	void fazAniversario() {
		idade++;
	}

}
