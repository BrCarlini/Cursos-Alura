package bytebank;

public class TestaReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		
		System.out.println("saldo primeira conta: " + primeiraConta.saldo);
		
		
		Conta segundaConta = primeiraConta;
		System.out.println("salda segunda conta: " + segundaConta.saldo);
		
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		}else {
			System.out.println("Não é a mesma conta");
		}
		
		
	}

}
