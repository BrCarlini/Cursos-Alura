package exerciciosPoo.exConta;

public class Conta {
	private static int geradorId = 0;
	private int id = 100;
	private String nomeTitular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataDeAbertura;
	
	Conta(String nomeTitular, int numero, String agencia, String dataDeAbertura){
		geradorId++;
		this.id += geradorId;
		this.nomeTitular = nomeTitular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = 0;
		this.dataDeAbertura = dataDeAbertura;
	}
	
	
	
	int getId() {
		return this.id;
	}
	

	String getNomeTitular() {
		return this.nomeTitular;
	}
	
	
	void setNomeTitular(String novoNome) {
		this.nomeTitular = novoNome;
	}
	
	
	int getNumero() {
		return this.numero;
	}
	
	
	String getAgencia() {
		return this.agencia;
	}
	
	
	void setAgencia(String novaAgencia) {
		this.agencia = novaAgencia;
	}
	
	
	double getSaldo(){
		return this.saldo;
	}
	
	
	String getDataAbertura(){
		return String.valueOf(this.dataDeAbertura);
	}
	
	
	boolean sacar(double valor) {
		
		if(valor <= this.saldo && valor > 0) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	
	boolean depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	
	
	double getRendimento() {
		return this.saldo * 0.1;
	}
	
	/*
	String recuperaDadosParaImpressao() {
		
		String nomeTitular = this.nomeTitular;
		String numero = String.valueOf(this.numero);
		String agencia = this.agencia;
		String saldo = String.valueOf(this.saldo);
		Data dataDeAbertura = new Data();
		
		return "Nome do titular: "  + nomeTitular + "\nNumero: " + numero + "\nAgencia: " + agencia + "\nSaldo: " + saldo + "\nData de Abertura: " + dataDeAbertura.dataFormatada();
	}
	*/
	

	
	
}
