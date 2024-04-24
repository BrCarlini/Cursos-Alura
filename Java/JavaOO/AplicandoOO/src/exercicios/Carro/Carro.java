package exercicios.Carro;


public class Carro {
	/*
	 * Crie uma classe Carro com atributos 
	 * modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
	 * 
	 * */
	
	String modelo;
	int ano;
	String cor;
	
	void exibeFichaTecnica() {
		System.out.printf("""
				Modelo:   %s
				Ano:      %d
				Cor:      %s
				""", this.modelo, this.ano, this.cor);
	}
	
	
	int calculaIdadeDoCarro(int anoAtual) {
		return anoAtual - this.ano;
	}
	
	
	
	

}
