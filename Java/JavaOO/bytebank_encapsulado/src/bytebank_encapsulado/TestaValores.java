package bytebank_encapsulado;

public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2002);
		Conta conta2 = new Conta(1337, 2003);
		Conta conta3 = new Conta(1337, 2004);
		
		conta.setAgencia(-50);
		conta.setNumero(-350);
		
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("Numero: " + conta.getNumero());
		System.out.println("Total de contas Criadas: " + Conta.getTotal());
		
	}

}
