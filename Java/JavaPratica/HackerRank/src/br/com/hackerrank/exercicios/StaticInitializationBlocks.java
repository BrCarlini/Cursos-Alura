package br.com.hackerrank.exercicios;

import java.util.Scanner;

public class StaticInitializationBlocks {

	public static int B;
	public static int H;
	public static boolean flag;
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		flag = true;
		
		sc.close();
		
		
		try {
			if (B <= 0 || H <= 0) {
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			flag = false;
			System.out.print(e);
		}
	}

	public static void main(String[] args) {

		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}

}
