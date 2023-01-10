package bytebank_encapsulado;

public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		
		Cliente paulo = new Cliente();
		paulo.setNome("paulo");
		paulo.setCpf("444.555.666.77");
		paulo.setProfissao("Programador");
		System.out.println(paulo.getNome());
		System.out.println(paulo.getCpf());
		System.out.println(paulo.getProfissao());
		
		System.out.println("================================");
		
		Cliente contaTitularPaulo = paulo;
		conta.setTitular(contaTitularPaulo);
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getProfissao());
		
	}

}
