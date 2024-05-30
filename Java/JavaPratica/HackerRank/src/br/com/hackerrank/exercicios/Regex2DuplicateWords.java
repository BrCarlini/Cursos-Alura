package br.com.hackerrank.exercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2DuplicateWords {
	
	public static void main(String[] args) {

	    String regex = "\\b(\\w+)(\\s+\\1\\b)+"; 
	    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); 
	    Scanner in = new Scanner(System.in);
	    int numSentences = Integer.parseInt(in.nextLine());

	    while (numSentences-- > 0) {
	        String input = in.nextLine();

	        Matcher matcher = p.matcher(input);

	        
	        while (matcher.find()) {
	            input = input.replaceAll(matcher.group(), matcher.group(1)); 
	        }

	        
	        System.out.println(input);
	    }

	    in.close();
	}

}
