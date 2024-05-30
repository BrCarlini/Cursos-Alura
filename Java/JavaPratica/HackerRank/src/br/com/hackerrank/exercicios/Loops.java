package br.com.hackerrank.exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int result;
        if(N >= 2 && N <= 20){
            
            for(int i = 1; i <= 10; i++){
                result = N * i;
                System.out.printf("%d x %d = %d\n", N, i, result);
            }
        }

        bufferedReader.close();
    }
}
