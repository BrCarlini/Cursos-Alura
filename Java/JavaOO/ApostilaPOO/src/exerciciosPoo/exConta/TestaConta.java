package exerciciosPoo.exConta;

public class TestaConta {
	public static void main(String[] args) {
		Data dataAbertura = new Data();
		Conta c1 = new Conta("Bruno", 123, "321-1", dataAbertura.getDataAtual());
		Conta c2 = new Conta("Julia", 124, "321-1", dataAbertura.getDataAtual());
		Conta c3 = new Conta("Luiz", 125, "321-1", dataAbertura.getDataAtual());
		
		System.out.println("ID: " + c1.getId());
		System.out.println("Nome do Titular: " + c1.getNomeTitular());
		System.out.println("Número: " + c1.getNumero());
		System.out.println("Agência: " + c1.getAgencia());
		System.out.println("Saldo: " + c1.getSaldo());
		System.out.println("Data de abertura: " + c1.getDataAbertura());
		
		System.out.println("==============================================");
		
		System.out.println("ID: " + c2.getId());
		System.out.println("Nome do Titular: " + c2.getNomeTitular());
		System.out.println("Número: " + c2.getNumero());
		System.out.println("Agência: " + c2.getAgencia());
		System.out.println("Saldo: " + c2.getSaldo());
		System.out.println("Data de abertura: " + c2.getDataAbertura());
		
		System.out.println("==============================================");
				
		
		System.out.println("ID: " + c3.getId());
		System.out.println("Nome do Titular: " + c3.getNomeTitular());
		System.out.println("Número: " + c3.getNumero());
		System.out.println("Agência: " + c3.getAgencia());
		System.out.println("Saldo: " + c3.getSaldo());
		System.out.println("Data de abertura: " + c3.getDataAbertura());
		
		System.out.println("==============================================");
		
		if(c1.sacar(100)) {
			System.out.println("Saque realizado com sucesso.");
		}else {
			System.out.println("Falha na tentativa de saque.");
		}
		
		
		if(c1.depositar(1700)) {
			System.out.println("Valor depositado com sucesso");
		}else {
			System.out.println("Falha no deposito");
		}
		
		System.out.println("Saldo atualizado: "+ c1.getSaldo());
		
		
		if(c1.sacar(100)) {
			System.out.println("Saque realizado com sucesso.");
		}else {
			System.out.println("Falha na tentativa de saque.");
		}
		
		
		System.out.println("Saldo atualizado: "+ c1.getSaldo());
/*		
		
		Conta c2 = new Conta();
		
		
		
		if(c1 == c2) {
			System.out.println("Contas iguais.");
		}else {
			System.out.println("Contas diferentes.");
		}
		
		
		System.out.println(c1.recuperaDadosParaImpressao());
		
		
		if(c1.depositar(1700)) {
			System.out.println("Valor depositado com sucesso");
		}else {
			System.out.println("Falha no deposito");
		}
		
		System.out.println("=============================================");
		System.out.println(c1.recuperaDadosParaImpressao());
		
		
		
		*/
		
		
		
	}
}
