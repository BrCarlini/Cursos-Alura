package bytebank_heranca;

public class Gerente extends Funcionario {
	
	private int senha;
	
	
	void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	
	boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Senha autenticada com sucesso");
			return true;
		}else {
			System.out.println("Senha incorreta");
			return false;
		}
	}
	
	
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
	

}
