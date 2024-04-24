package exerciciosPoo.exPessoa;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Bruno";
		p1.idade = 1;
		
		System.out.println("Nome: " + p1.getNome() + "\nIdade: " + p1.getIdade());
		
		p1.fazAniversario();
		p1.fazAniversario();
		p1.fazAniversario();
		p1.fazAniversario();
		p1.fazAniversario();
		p1.fazAniversario();
		
		System.out.println("===========================");
		
		System.out.println("Nome: " + p1.getNome() + "\nIdade: " + p1.getIdade());

	}

}
