package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50.0);
		
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDoPaulo);
		System.out.println("Valor atualizado da conta da Marcela: " + contaDaMarcela.saldo);
		System.out.println("Valor atualizado da conta da Paulo: " + contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo";
		
	}

}
