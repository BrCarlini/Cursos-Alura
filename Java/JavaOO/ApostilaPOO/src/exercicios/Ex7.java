package exercicios;

public class Ex7 {
	public static void main(String[] args) {
		for (int n = 1; n <= 40; n++) {
			long fatorial = 1;
			for (int i = 1; i <= n; i++) {
				fatorial *= i;
			}
			System.out.println("O fatorial de " + n + " é: " + fatorial);
		}
	}
}
