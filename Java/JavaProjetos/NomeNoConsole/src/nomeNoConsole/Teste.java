package nomeNoConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Teste extends JFrame implements KeyListener {
    private JPanel panel;
    private int x, y; // coordenadas do caractere
    private char[][] pattern; // padrão de caracteres desenhados

    public Teste() {
        setTitle("Movimento de Caractere");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Cria um JPanel personalizado para desenhar o padrão de caracteres
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawPattern(g);
                drawCharacter(g, x, y);
            }
        };
        add(panel);

        // Inicializa as coordenadas do caractere no centro do JPanel
        x = 200;
        y = 200;

        // Inicializa o padrão de caracteres desenhados com espaços vazios
        pattern = new char[25][152];
        for (int linha = 0; linha < pattern.length; linha++) {
            for (int col = 0; col < pattern[0].length; col++) {
                pattern[linha][col] = ' ';
            }
        }

        // Adiciona o KeyListener ao JFrame para detectar eventos de teclado
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        setVisible(true);
    }

    // Método para desenhar o padrão de caracteres
    private void drawPattern(Graphics g) {
        for (int linha = 0; linha < pattern.length; linha++) {
            for (int col = 0; col < pattern[0].length; col++) {
                g.drawString(String.valueOf(pattern[linha][col]), col * 10, linha * 10);
            }
        }
    }

    // Método para desenhar o caractere na posição especificada
    private void drawCharacter(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 24));
        g.drawString("X", x, y);
    }

    // Implementação dos métodos KeyListener
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        int newX = x;
        int newY = y;

        // Calcula a nova posição do caractere
        switch (keyCode) {
            case KeyEvent.VK_LEFT:
                newX -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                newX += 10;
                break;
            case KeyEvent.VK_UP:
                newY -= 10;
                break;
            case KeyEvent.VK_DOWN:
                newY += 10;
                break;
        }

        // Verifica se a nova posição está dentro dos limites e se está vazia
        if (isValidPosition(newX, newY)) {
            x = newX;
            y = newY;
        } else {
            // Se a nova posição não estiver vazia, exibe a mensagem de "Game Over" e encerra o programa
            JOptionPane.showMessageDialog(this, "Game Over");
            System.exit(0);
        }

        // Redesenha o JPanel para atualizar a posição do caractere
        panel.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    // Método para verificar se a posição é válida (dentro dos limites e vazia)
    private boolean isValidPosition(int x, int y) {
        return x >= 0 && y >= 0 && x + 10 <= getWidth() && y + 10 <= getHeight()
                && pattern[y / 10][x / 10] == ' ';
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Teste::new);
    }
}
