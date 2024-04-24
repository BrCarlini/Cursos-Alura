package br.com.hackerrank.exercicios;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

	}

	static boolean isAnagram(String a, String b) {
		// Complete the function
		String aA = a.toLowerCase().toString();
		String bB = b.toLowerCase().toString();
		String str1 = sortArray(aA);
		String str2 = sortArray(bB);

		boolean answer = str1.equals(str2);
		return answer;

	}

	public static String sortArray(String a) {
		char[] str = a.toCharArray();

		for (int i = 0; i < str.length - 1; i++) {
			for (int j = 0; j < str.length - i - 1; j++) {
				if (str[j] > str[j + 1]) {
					char temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		return new String(str);
	}

}
