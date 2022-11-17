package Q2440;

import java.util.Scanner;

/* 선생님 문제풀이와 동일  */
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.close();

		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
