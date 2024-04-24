package exercicios.Musica;

public class Musica {
	/*
	 * Crie uma classe 
	 * Musica com atributos titulo, artista, anoLancamento, avaliacao e 
	 * numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e
	 *  calcular a média de avaliações.
	 * 
	 * */
	
	String titulo;
	String artista;
	int anoLancamento;
	double avaliacao;
	int numAvaliacoes;
	
	
	void exibeFichaTecnica() {
		
		System.out.printf("""
				Titulo:               %s
				Artista:              %s
				Ano de Lançamento:    %d
				Avaliação:            %.1f
				""", this.titulo, this.artista, this.anoLancamento, this.avaliacao );
	}
	
	
	void avaliaMusica(double nota) {
		this.avaliacao += nota;
		this.numAvaliacoes++;
	}
	
	double exibeMediaAvaliacao() {
		return this.avaliacao / this.numAvaliacoes;
	}

}
