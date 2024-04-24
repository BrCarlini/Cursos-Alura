package nomeNoConsole;

public class LetraR {
	
	public static void getLetraR() {
		String espaco = " ";
		char x = '*';
		int altura = 20;
		int largura = 20;
		
		//System.out.println(espaco);
		/*
		System.out.println(
				"""
				**********
				*        *
				*        *
				* ****** *
				*    *      
				*     * 
				*      *
				*       *
	""");
	*/
		
		
		for(int linha = 0; linha < largura; linha++) {
			
			for(int col = 0; col < altura; col++) {
				
				
				// Linha 0
				if(linha == 0 && col == 0) {
					for (int i = 0; i < largura - 10; i++) {
						System.out.print(x);
					}
					System.out.println();
				}
				
				
				
				
				// Linha 1
				if(linha == 1 && col == 0) {
					System.out.print(x);
				}
				
				if(linha == 1 && col == 1) {
					System.out.print(espaco);
				}
				
				if(linha == 1 && col == 2) {
					System.out.print(espaco);
				}
				
				if(linha == 1 && col == 3) {
					System.out.print(espaco);
				}
				
				if(linha == 1 && col == 4) {
					System.out.print(espaco);
				}
				
				if(linha == 1 && col == 5) {
					System.out.print(espaco);
				}
				
				if(linha == 1 && col == 6) {
					System.out.print(espaco);
				}
				
				if(linha == 1 && col == 7) {
					System.out.print(espaco);
				}
				
				if(linha == 1 && col == 8) {
					System.out.print(espaco);
				}
				
				if(linha == 1 && col == 9) {
					System.out.println(x);
				}
				
				
				
				// Linha 2
				if(linha == 2 && col == 0) {
					System.out.print(x);
				}
				
				if(linha == 2 && col == 1) {
					System.out.print(espaco);
				}
				
				if(linha == 2 && col == 2) {
					System.out.print(espaco);
				}
				
				if(linha == 2 && col == 3) {
					System.out.print(espaco);
				}
				
				if(linha == 2 && col == 4) {
					System.out.print(espaco);
				}
				
				if(linha == 2 && col == 5) {
					System.out.print(espaco);
				}
				
				if(linha == 2 && col == 6) {
					System.out.print(espaco);
				}
				
				if(linha == 2 && col == 7) {
					System.out.print(espaco);
				}
				
				if(linha == 2 && col == 8) {
					System.out.print(espaco);
				}
				
				if(linha == 2 && col == 9) {
					System.out.println(x);
				}
				
				
				
				// Linha 3
				if(linha == 3 && col == 0) {
					System.out.print(x);
				}
				
				if(linha == 3 && col == 1) {
					System.out.print(espaco);
				}
				
				if(linha == 3 && col == 2) {
					System.out.print(x);
				}
				
				if(linha == 3 && col == 3) {
					System.out.print(x);
				}
				
				if(linha == 3 && col == 4) {
					System.out.print(x);
				}
				
				if(linha == 3 && col == 5) {
					System.out.print(x);
				}
				
				if(linha == 3 && col == 6) {
					System.out.print(x);
				}
				
				if(linha == 3 && col == 7) {
					System.out.print(x);
				}
				
				if(linha == 3 && col == 8) {
					System.out.print(espaco);
				}
				
				if(linha == 3 && col == 9) {
					System.out.println(x);
				}
				
				
				// Linha 4
				if(linha == 4 && col == 0) {
					System.out.print(x);
				}
				
				if(linha == 4 && col == 1) {
					System.out.print(espaco);
				}
				
				if(linha == 4 && col == 2) {
					System.out.print(espaco);
				}
				
				if(linha == 4 && col == 3) {
					System.out.print(espaco);
				}
				
				if(linha == 4 && col == 4) {
					System.out.print(espaco);
				}
				
				if(linha == 4 && col == 5) {
					System.out.println(x);
				}
				
				
				// Linha 5
				if(linha == 5 && col == 0) {
					System.out.print(x);
				}
				
				if(linha == 5 && col == 1) {
					System.out.print(espaco);
				}
				
				if(linha == 5 && col == 2) {
					System.out.print(espaco);
				}
				
				if(linha == 5 && col == 3) {
					System.out.print(espaco);
				}
				
				if(linha == 5 && col == 4) {
					System.out.print(espaco);
				}
				
				if(linha == 5 && col == 5) {
					System.out.print(espaco);
				}
				
				if(linha == 5 && col == 6) {
					System.out.println(x);
				}
				
				
				// Linha 6
				if(linha == 6 && col == 0) {
					System.out.print(x);
				}
				
				if(linha == 6 && col == 1) {
					System.out.print(espaco);
				}
				
				if(linha == 6 && col == 2) {
					System.out.print(espaco);
				}
				
				if(linha == 6 && col == 3) {
					System.out.print(espaco);
				}
				
				if(linha == 6 && col == 4) {
					System.out.print(espaco);
				}
				
				if(linha == 6 && col == 5) {
					System.out.print(espaco);
				}
				
				if(linha == 6 && col == 6) {
					System.out.print(espaco);
				}
				
				if(linha == 6 && col == 7) {
					System.out.println(x);
				}
				
				
				// Linha 7
				if(linha == 7 && col == 0) {
					System.out.print(x);
				}
				
				if(linha == 7 && col == 1) {
					System.out.print(espaco);
				}
				
				if(linha == 7 && col == 2) {
					System.out.print(espaco);
				}
				
				if(linha == 7 && col == 3) {
					System.out.print(espaco);
				}
				
				if(linha == 7 && col == 4) {
					System.out.print(espaco);
				}
				
				if(linha == 7 && col == 5) {
					System.out.print(espaco);
				}
				
				if(linha == 7 && col == 6) {
					System.out.print(espaco);
				}
				
				if(linha == 7 && col == 7) {
					System.out.print(espaco);
				}
				
				if(linha == 7 && col == 8) {
					System.out.print(x);
				}
				
				
				
				
				
				
				
				
				
				
			}
		}
	}

}
