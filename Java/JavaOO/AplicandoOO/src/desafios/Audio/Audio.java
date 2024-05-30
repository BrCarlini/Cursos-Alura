package desafios.Audio;

public class Audio {
	
	private String titulo;
	private int totalReproducoes;
	private int totalCurtidas;
	private int classificacao;
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTotalReproducoes() {
		return totalReproducoes;
	}

	public void setTotalReproducoes(int totalReproducoes) {
		this.totalReproducoes = totalReproducoes;
	}

	public int getTotalCurtidas() {
		return totalCurtidas;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	
	
	public void curte() {
		this.totalCurtidas++;
	}
	
	public void reproduz() {
		this.totalReproducoes++;
	}

}
