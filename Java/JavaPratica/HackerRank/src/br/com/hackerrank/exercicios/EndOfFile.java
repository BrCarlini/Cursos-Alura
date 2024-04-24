package br.com.hackerrank.exercicios;

import java.util.Scanner;

public class EndOfFile {
	
	public static void main(String[] args) {

	    Scanner scn = new Scanner (System.in);
	    int count =1;

	    while(scn.hasNext())
	    {
	        String str = scn.nextLine();
	        System.out.println(count+" "+str);
	        count++;
	    }
	    scn.close();
	}

}
