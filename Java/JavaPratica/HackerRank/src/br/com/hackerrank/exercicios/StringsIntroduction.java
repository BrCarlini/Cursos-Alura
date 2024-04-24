package br.com.hackerrank.exercicios;


import java.util.Scanner;

public class StringsIntroduction {
	
	
	public static void main(String[] args) {
		
		Scanner scn =  new Scanner(System.in);
		
		String A = scn.next();
		String B = scn.next();
		
		int lengthOfA = A.length();
		int lengthOfB = B.length();
		
		char firstCharA = A.charAt(0);
		String firstCharAString = "" +A.charAt(0);
		String editFirstCharA = ""+firstCharA;
		
		String editA = A.replace(firstCharAString, editFirstCharA.toUpperCase());
		//System.out.println(editA);
		
		
		char firstCharB = B.charAt(0);
		String firstCharBString = "" +B.charAt(0);
		String editFirstCharB = ""+firstCharB;
		
		String editB = B.replace(firstCharBString, editFirstCharB.toUpperCase());
		//System.out.println(editB);
		
		
		
		System.out.println(lengthOfA + lengthOfB);
		
		if(lengthOfA > lengthOfB) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
		System.out.println(editA + " " + editB);
		
		scn.close();
		

	}
	

}
