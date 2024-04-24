package exerciciosPoo.exConta;

public class TestaFuncionario {
	public static void main(String[] args) {
		Gerente g1 = new Gerente("Joao", "111.333.555-09", 5000);
		
		System.out.println("Nome do Gerente: " + g1.getNome());
		System.out.println("CPF do Gerente: " + g1.getCpf());
		System.out.println("Salario do Gerente: " + g1.getSalario());
		System.out.println("Bonificação: " + g1.getBonificacao());
	}
}
