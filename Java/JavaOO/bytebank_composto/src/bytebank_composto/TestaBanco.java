package bytebank_composto;

public class TestaBanco {
	
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo";
		paulo.cpf = "111.222.333-44";
		paulo.profissao = "Programador";
		
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
		
	}

}
