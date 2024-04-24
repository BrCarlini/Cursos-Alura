package nomeNoConsole;

public class CharacterMovement {

    public static void main(String[] args) {
        // Iniciando a thread para o movimento do caractere
        Thread t = new Thread(new CharacterMover());
        t.start();
    }

    static class CharacterMover implements Runnable {
        @Override
        public void run() {
            try {
                int position = 1000;
                while (true) {
                    // Limpar a tela do console
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    // Imprimir espaços em branco para mover o caractere
                   /* for (int i = 0; i < position; i++) {
                        //System.out.print(" ");
                    }
                    */

                    // Imprimir o caractere
                    //System.out.println("*");
                    String espaco = " ";
            		char x = '○';
            		int altura = 137;
            		int largura = 25;
            		char[] cobrinha = {'§', ' '};
            		
            		
            		for(int linha = 0; linha < largura; linha++) {
            			for(int col = 0; col < altura; col++) {
            				
            				if(linha == 0 || col == 0 || linha == 24 || col == 136) {
            					System.out.print("♦");
            					
            				}else if((linha == 7 && col == 5) || // Letra C
            						(linha == 7 && col == 6) ||
            						(linha == 7 && col == 7) ||
            						(linha == 7 && col == 8) ||
            						(linha == 7 && col == 9) ||
            						(linha == 7 && col == 10) ||
            						(linha == 7 && col == 11) ||
            						(linha == 7 && col == 12) ||
            						(linha == 7 && col == 13) ||
            						(linha == 8 && col == 5) ||
            						(linha == 9 && col == 5) ||
            						(linha == 10 && col == 5) ||
            						(linha == 11 && col == 5) ||
            						(linha == 12 && col == 5) ||
            						(linha == 13 && col == 5) ||
            						(linha == 14 && col == 5) ||
            						(linha == 15 && col == 5) ||
            						(linha == 16 && col == 5) ||
            						(linha == 16 && col == 6) ||
            						(linha == 16 && col == 7) ||
            						(linha == 16 && col == 8) ||
            						(linha == 16 && col == 9) ||
            						(linha == 16 && col == 10) ||
            						(linha == 16 && col == 11) ||
            						(linha == 16 && col == 12) ||
            						(linha == 16 && col == 13) 
            						) {
            					System.out.print(x);
            				}else if((linha == 7 && col == 29) || // Letra A
            						(linha == 7 && col == 30) ||
            						(linha == 7 && col == 31) ||
            						(linha == 8 && col == 32) ||
            						(linha == 8 && col == 28) ||
            						(linha == 9 && col == 27) ||
            						(linha == 9 && col == 33) ||
            						(linha == 10 && col == 26) ||
            						(linha == 10 && col == 34) ||
            						(linha == 11 && col == 25) ||
            						(linha == 11 && col == 35) ||
            						(linha == 12 && col == 24) ||
            						(linha == 12 && col == 26) ||
            						(linha == 12 && col == 27) ||
            						(linha == 12 && col == 28) ||
            						(linha == 12 && col == 29) ||
            						(linha == 12 && col == 30) ||
            						(linha == 12 && col == 31) ||
            						(linha == 12 && col == 32) ||
            						(linha == 12 && col == 33) ||
            						(linha == 12 && col == 34) ||
            						(linha == 12 && col == 36) ||
            						(linha == 13 && col == 23) ||
            						(linha == 13 && col == 37) ||
            						(linha == 14 && col == 22) ||
            						(linha == 14 && col == 38) ||
            						(linha == 15 && col == 21) ||
            						(linha == 15 && col == 39) ||
            						(linha == 16 && col == 20) ||
            						(linha == 16 && col == 40)   
            						) {
            					System.out.print(x);
            				}else if((linha == 7 && col == 50) || // Letra R
            						(linha == 7 && col == 51) ||
            						(linha == 7 && col == 52) ||
            						(linha == 7 && col == 53) ||
            						(linha == 7 && col == 54) ||
            						(linha == 7 && col == 55) ||
            						(linha == 7 && col == 56) ||
            						(linha == 7 && col == 57) ||
            						(linha == 7 && col == 58) ||
            						(linha == 7 && col == 59) ||
            						(linha == 8 && col == 59) ||
            						(linha == 8 && col == 50) ||
            						(linha == 9 && col == 59) ||
            						(linha == 9 && col == 50) ||
            						(linha == 10 && col == 59) ||
            						(linha == 10 && col == 50) ||
            						(linha == 11 && col == 59) ||
            						(linha == 11 && col == 50) ||
            						(linha == 12 && col == 50) ||
            						(linha == 12 && col == 52) ||
            						(linha == 12 && col == 53) ||
            						(linha == 12 && col == 54) ||
            						(linha == 12 && col == 55) ||
            						(linha == 12 && col == 56) ||
            						(linha == 12 && col == 57) ||
            						(linha == 12 && col == 59) ||
            						(linha == 13 && col == 50) ||
            						(linha == 13 && col == 56) ||
            						(linha == 14 && col == 57) ||
            						(linha == 14 && col == 50) ||
            						(linha == 15 && col == 50) ||
            						(linha == 15 && col == 58) ||
            						(linha == 16 && col == 50) ||
            						(linha == 16 && col == 59)
            						) {
            					System.out.print(x);
            				}else if((linha == 7 && col == 69) || // Letra L
            						(linha == 8 && col == 69) ||
            						(linha == 9 && col == 69) ||
            						(linha == 10 && col == 69) ||
            						(linha == 11 && col == 69) ||
            						(linha == 12 && col == 69) ||
            						(linha == 13 && col == 69) ||
            						(linha == 14 && col == 69) ||
            						(linha == 15 && col == 69) ||
            						(linha == 16 && col == 69) ||
            						(linha == 16 && col == 70) ||
            						(linha == 16 && col == 71) ||
            						(linha == 16 && col == 72) ||
            						(linha == 16 && col == 73) ||
            						(linha == 16 && col == 74) ||
            						(linha == 16 && col == 75) ||
            						(linha == 16 && col == 76) ||
            						(linha == 16 && col == 77) ||
            						(linha == 16 && col == 78) ||
            						(linha == 16 && col == 79)
            						) {
            					System.out.print(x);
            				}else if((linha == 7 && col == 89) || // Letra I
            						(linha == 9 && col == 89) ||
            						(linha == 10 && col == 89) ||
            						(linha == 11 && col == 89) ||
            						(linha == 12 && col == 89) ||
            						(linha == 13 && col == 89) ||
            						(linha == 14 && col == 89) ||
            						(linha == 15 && col == 89) ||
            						(linha == 16 && col == 89)
            						) {
            					System.out.print(x);
            				}else if((linha == 7 && col == 99) || // Letra N
            						(linha == 8 && col == 99) ||
            						(linha == 9 && col == 99) ||
            						(linha == 10 && col == 99) ||
            						(linha == 11 && col == 99) ||
            						(linha == 12 && col == 99) ||
            						(linha == 13 && col == 99) ||
            						(linha == 14 && col == 99) ||
            						(linha == 15 && col == 99) ||
            						(linha == 16 && col == 99) ||
            						(linha == 8 && col == 101) ||
            						(linha == 9 && col == 102) ||
            						(linha == 10 && col == 103) ||
            						(linha == 11 && col == 104) ||
            						(linha == 12 && col == 105) ||
            						(linha == 13 && col == 106) ||
            						(linha == 14 && col == 107) ||
            						(linha == 15 && col == 108) ||
            						(linha == 16 && col == 109) ||
            						(linha == 7 && col == 110) ||
            						(linha == 8 && col == 110) ||
            						(linha == 9 && col == 110) ||
            						(linha == 10 && col == 110) ||
            						(linha == 11 && col == 110) ||
            						(linha == 12 && col == 110) ||
            						(linha == 13 && col == 110) ||
            						(linha == 14 && col == 110) ||
            						(linha == 15 && col == 110) ||
            						(linha == 16 && col == 110)
            						) {
            					System.out.print(x);
            				}else if((linha == 7 && col == 120) || // Letra I
            						(linha == 9 && col == 120) ||
            						(linha == 10 && col == 120) ||
            						(linha == 11 && col == 120) ||
            						(linha == 12 && col == 120) ||
            						(linha == 13 && col == 120) ||
            						(linha == 14 && col == 120) ||
            						(linha == 15 && col == 120) ||
            						(linha == 16 && col == 120)
            						) {
            					System.out.print(x);
            				}else if((linha == 11 && col == 3)) {
            					System.out.print(cobrinha[0]);
            					
            				}else if((linha == 13 && col == 3)) {
            					
            					System.out.print(cobrinha[0]);
            					
            				}
            				
            				else {
            					System.out.print(espaco);
            					
            					
            				}
            				
            				
            				
            			}
            			System.out.println(" ");
            		}

                    // Atualizar a posição do caractere
                    position++;

                    // Verificar se o caractere atingiu o final da linha
                    if (position >= 80) {
                        position = 0; // Voltar para a posição inicial
                    }

                    // Pausa para controlar a velocidade do movimento
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

