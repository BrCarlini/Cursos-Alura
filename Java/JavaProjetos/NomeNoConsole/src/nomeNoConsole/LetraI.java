package nomeNoConsole;

public class LetraI {
	
	public static void getLetraI() {
		
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
		 * 
		 *
		  
		 * """);
		 */
		
		for (int linha = 0; linha < largura; linha++) {

			for (int col = 0; col < altura; col++) {
				
				if(linha == 0 && col == 0) {
					System.out.println(x);
				}
				
				
				
				if(linha == 1 && col == 0) {
					System.out.println();
					for(int i = 0; i < altura - 12; i++) {
						System.out.println(x);		
					}
				}
				
				
				
				
				
				
			}
		}
		
		
		
	}

}
