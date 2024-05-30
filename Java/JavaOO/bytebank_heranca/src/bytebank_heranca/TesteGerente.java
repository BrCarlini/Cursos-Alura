package bytebank_heranca;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Bruno");
		g1.setCpf("111.222.333.44");
		g1.setSalario(5000);
		g1.setSenha(123);
		
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("CPF: " + g1.getCpf());
		
		g1.autentica(123);
		
		System.out.println(g1.getBonificacao());
		
	}
	
}
