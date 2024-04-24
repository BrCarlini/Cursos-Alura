package br.com.hackerrank.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int q = scanner.nextInt();

        
        for (int i = 0; i < q; i++) {
            String queryType = scanner.next();
            if (queryType.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else if (queryType.equals("Delete")) {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }

        
        for (int num : list) {
            System.out.print(num + " ");
        }

        scanner.close();
	}

}
