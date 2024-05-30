package br.com.hackerrank.exercicios;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			// Write your code
			
			if (isValidRegex(pattern)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
			
			testCases--;
		}
		
		in.close();
	}
	
	
	private static boolean isValidRegex(String pattern) {
        try {
            Pattern.compile(pattern);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }

}
