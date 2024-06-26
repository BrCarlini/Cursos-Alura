package br.com.hackerrank.exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Array2D {
	
	public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Lendo a matriz
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Encontrando a maior soma de hourglass
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                                        + arr[i+1][j+1] +
                          arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                maxSum = Math.max(maxSum, sum);
            }
        }

        // Imprimindo a maior soma
        System.out.println(maxSum);

        scanner.close();
    }

}
