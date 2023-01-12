package bytebank_heranca;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Bruno Carlini");
		funcionario1.setCpf("444.555.666.77");
		funcionario1.setSalario(1000);
		
		System.out.println("Nome: " + funcionario1.getNome());
		System.out.println("CPF: " + funcionario1.getCpf());
		System.out.println("Salario: " + funcionario1.getSalario());
		
		System.out.println("Bonificacao: " + funcionario1.getBonificacao());

	}

}
