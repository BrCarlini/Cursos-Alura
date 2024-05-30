package nomeNoConsole;

public class LetraL {

	public static void getLetraL() {

		String espaco = " ";
		char x = '*';
		int altura = 20;
		int largura = 20;

		// System.out.println(espaco);
		/*
		 * System.out.println( """
		 
		 *
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 **********
		  
		 * """);
		 */

		for (int linha = 0; linha < largura; linha++) {

			for (int col = 0; col < altura; col++) {
				
				
				if(linha == 0 && col == 0) {
					for(int i = 0; i < altura - 13; i++) {
						System.out.println(x);		
					}
				}
				
				
				if(linha == 8 && col == 0) {
					for(int j = 0; j < largura - 10; j++) {
						System.out.print(x);
					}
				}
				
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
