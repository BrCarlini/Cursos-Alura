package br.com.hackerrank.exercicios;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();
		System.out.println(S.length());

		try {
			String editWord = S.substring(start, end);
			// a r v o r e
			// 0 1 2 3 4 5

			if (S.length() >= 1 || S.length() <= 100 && start >= 0 && start < end) {
				System.out.println(editWord);
			}
		} catch (StringIndexOutOfBoundsException ex) {
			System.out.println("Error -> " + ex);
		}

		in.close();

	}

}
