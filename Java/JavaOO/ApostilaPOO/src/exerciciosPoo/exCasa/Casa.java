package exerciciosPoo.exCasa;

public class Casa {
	String cor;
	boolean porta1;
	boolean porta2;
	boolean porta3;
	
	void pinta(String cor) {
		this.cor = cor;
	}
	
	int quantasPortasEstaoAbertas() {
		
		int qtdPortaAberta = 0;
		
		if(this.porta1) {
			qtdPortaAberta++;
		}
		
		if(this.porta2) {
			qtdPortaAberta++;
		}
		
		if(this.porta3) {
			qtdPortaAberta++;
		}
		
		return qtdPortaAberta;
	}
}
