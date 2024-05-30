package exerciciosPoo.exConta;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	String getNome(){
		return this.nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	String getCpf(){
		return this.cpf;
	}
	
	double getSalario() {
		return this.salario;
	}
	
	
	
	public double getBonificacao() {
		return salario * 0.10;
	}
	
	
}
