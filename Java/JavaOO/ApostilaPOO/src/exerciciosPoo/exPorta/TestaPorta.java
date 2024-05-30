package exerciciosPoo.exPorta;

public class TestaPorta {

	public static void main(String[] args) {
		Porta porta1 = new Porta();
		porta1.dimensaoX = 1.3;
		porta1.dimensaoY = 2.0;
		porta1.dimensaoZ = 0.05;
		
		porta1.abre();
		porta1.pinta("Branco");
		
		
		System.out.println(porta1.imprimeDados());
		
		if(porta1.estaAberta()) {
			System.out.println("A porta esta aberta!");
		}else {
			System.out.println("A porta nao esta aberta!");
		}
		
		System.out.println("=================");
		
		porta1.fecha();
		
		if(porta1.estaAberta()) {
			System.out.println("A porta esta aberta!");
		}else {
			System.out.println("A porta nao esta aberta!");
		}
		
		

	}

}
