package exerciciosPoo.exPorta;

public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	void abre() {
		this.aberta = true;
	}
	
	void fecha() {
		this.aberta = false;
	}
	
	void pinta(String cor) {
		this.cor = cor;
	}
	
	boolean estaAberta() {
		return this.aberta;
	}
	
	String imprimeDados() {
		String dados = String.valueOf(this.aberta) + "\n";
		dados += this.cor + "\n";
		dados += this.dimensaoX + "\n";
		dados += this.dimensaoY + "\n";
		dados += this.dimensaoZ;
		
		return dados;
	}
}
