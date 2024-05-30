package exercicios.Carro;
import java.time.LocalDate;

public class TestaCarro {

	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();
		
		Carro c1 = new Carro();
		c1.modelo = "Ford Ka";
		c1.ano = 1997;
		c1.cor = "Preto";
		
		c1.exibeFichaTecnica();
		
		System.out.println("Idade do carro: " + c1.calculaIdadeDoCarro(anoAtual));

	}

}
