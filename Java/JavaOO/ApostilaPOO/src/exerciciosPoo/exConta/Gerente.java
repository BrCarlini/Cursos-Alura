package exerciciosPoo.exConta;

public class Gerente extends Funcionario {
	int senha;
	int	numeroDeFuncionariosGerenciados;
	
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 500;
	}
	

}
