package exercicios.Musica;

public class TestaMusica {

	public static void main(String[] args) {
		Musica m1 = new Musica();
		m1.titulo = "All of Me";
		m1.artista = "John Legend";
		m1.anoLancamento = 2014;
		
		m1.exibeFichaTecnica();
		
		m1.avaliaMusica(3);
		m1.avaliaMusica(7);
		m1.avaliaMusica(5);
		
		
		m1.avaliacao = m1.exibeMediaAvaliacao();

		m1.exibeFichaTecnica();
	}

}
