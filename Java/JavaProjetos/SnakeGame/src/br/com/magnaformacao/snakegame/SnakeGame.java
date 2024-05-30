package br.com.magnaformacao.snakegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SnakeGame extends JFrame implements KeyListener {
    private JPanel panel;
    private int x, y; // coordenadas da cobra

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(1600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Cria um JPanel
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics grafico) {
                super.paintComponent(grafico);
                tabuleiro(grafico);
                desenhaCobra(grafico, x, y);
            }
        };
        add(panel);

        // Inicializa as coordenadas 
        x = 20;
        y = 120;

        // Adiciona o KeyListener ao JFrame para detectar eventos de teclado
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        setVisible(true);
    }

    // Método para criar a moldura e o nome
    private void tabuleiro(Graphics caractere) {
        int largura = 127; // largura do padrão
        int altura = 25;   // altura do padrão

        String x = "X";      
        char espaco = ' '; 

        for (int linha = 0; linha < altura; linha++) {
            for (int col = 0; col < largura; col++) {
            	
            	if(linha == 1 || col == 0 || linha == 24 || col == 126) {//136 151
            		caractere.drawString("♦", col * 10, linha * 10);
					
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
					caractere.drawString(x, col * 10, linha * 10);
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
					caractere.drawString(x, col * 10, linha * 10);
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
					caractere.drawString(x, col * 10, linha * 10);
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
					caractere.drawString(x, col * 10, linha * 10);
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
					caractere.drawString(x, col * 10, linha * 10);
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
					caractere.drawString(x, col * 10, linha * 10);
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
					caractere.drawString(x, col * 10, linha * 10);
				}else {
					System.out.print(espaco);
				}
            	
            	
            	
            	
            	
            	
            	
            	
            	
            }
        }
    }

    // Método para desenhar o caractere na posição especificada
    private void desenhaCobra(Graphics repreCobra, int x, int y) {
    	repreCobra.setColor(Color.BLACK);
    	repreCobra.setFont(new Font("Arial", Font.PLAIN, 24));
    	repreCobra.drawString("X", x, y);
    }

    // Métodos KeyListener
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent evento) {
        int keyCode = evento.getKeyCode();
        int novaPosicaoX = x;
        int novaPosicaoY = y;
        
        switch (keyCode) {
            case KeyEvent.VK_LEFT:
            	novaPosicaoX -= 10;
                break;
            case KeyEvent.VK_RIGHT:
            	novaPosicaoX += 10;
                break;
            case KeyEvent.VK_UP:
            	novaPosicaoY -= 10;
                break;
            case KeyEvent.VK_DOWN:
            	novaPosicaoY += 10;
                break;
        }
        
        
       
        
        // Verifica se a nova posição está dentro dos limites e se está vazia
        if (validaPosicao(novaPosicaoX, novaPosicaoY)) {
            x = novaPosicaoX;
            y = novaPosicaoY;
        } else {
            // Se a nova posição não estiver vazia, exibe a mensagem de "Game Over" e encerra o programa
            JOptionPane.showMessageDialog(this, "Game Over");
            System.exit(0);
        }
        
        
        
     // Para atualizar o Panel e assim atualizar a posição da cobra
        panel.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {}
    
    
 // Método para verificar se a posição é válida (dentro dos limites)
    private boolean validaPosicao(int x, int y) {
    	
    	if(x >= 1 && y >= 22 && x + 50 <= getWidth() && y + 270 <= getHeight()) {
    		return true;
    	}
    	
    	/*
    	if(getWidth() >= 25 && getWidth() <= 35) {
    		return false;
    	}
    	*/
    	
        return false;
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SnakeGame::new);
        
    }
}


