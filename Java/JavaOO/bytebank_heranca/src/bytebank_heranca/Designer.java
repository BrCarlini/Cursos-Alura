package bytebank_heranca;

public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Designer");
		return super.getBonificacao() + 200;
	}

}
