package br.com.hackerrank.exercicios;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String A = sc.next().toLowerCase();
        
        if(A.length() <= 50) {
        String stringReverse = "";
        
        int lengthA = A.length() - 1;
        //System.out.println(lengthA);
        // b r u n o
       //  0 1 2 3 4
        
        for(int index = 0; index <= lengthA; index++) {
        	stringReverse += A.charAt(lengthA - index);
        }
        
        if(A.equals(stringReverse)) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
        
        
        }else {
        	System.out.println(" A will consist at most 50 lower case english letters");
        }

        sc.close();
	}

}
