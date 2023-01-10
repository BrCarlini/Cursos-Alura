package sintaxeVariaveisEfluxos;

public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("IR: 7.5%");
			System.out.println("Pode deduzir na declaração o valor de R$142");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("IR: 15%");
			System.out.println("Pode deduzir R$350");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("IR: 22.5%");
			System.out.println("Pode deduzir R$636");
		}

	}

}
