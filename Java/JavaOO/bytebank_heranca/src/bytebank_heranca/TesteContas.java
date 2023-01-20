package bytebank_heranca;

public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1, 0001);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(1, 0002);
		cp.deposita(100.0);
		
		
		cc.transfere(10.0, cp);
		
		cc.saca(10.0);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
	}

}
