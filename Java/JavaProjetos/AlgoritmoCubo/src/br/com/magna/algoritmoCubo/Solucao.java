package br.com.magna.algoritmoCubo;

public class Solucao {
	
	
	public void mostraSolucao(double a) {
		Thread representacaoCuboAberto = new Thread(new LeituraCuboTxt("AlgoritmoCuboAberto.txt"));
		
		// d = a(raiz quadrada de 2)
		double diagonalDoCubo = a * Math.sqrt(2);
		
		// D² = a² + d²
		double teoremaDePitagoras = Math.pow(a, 2) + (Math.pow(diagonalDoCubo, 2));
		
		System.out.printf(""" 
				
				      
				      Solução:            
				                                        MMC
				        D² = 6² + (6²√2)²            108  |2
				        D² = 36 + 36 * 2              54  |2
				        D² = %.0f                      27  |3
				        D = √2² * 3² * 3               9  |3
				        D = 2 * 3 √3                   3  |3
				                                       1  |
				        D = 6√3cm
				        
				""", teoremaDePitagoras);
		
		representacaoCuboAberto.start();
		try {
			Thread.sleep(0010);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}