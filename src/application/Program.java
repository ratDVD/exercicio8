package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] mat = new int[l][c];

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int numero = sc.nextInt();

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				if (mat[i][j] == numero) {
					System.out.println("Position " + i + "," + j + ":");

					if (j > 0) {
						System.out.println("Left:" + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up:" + mat[i - 1][j]);
					}
					if (j < l) {
						System.out.println("Right:" + mat[i][j + 1]);
					}
					if (i < c) {
						System.out.println("Down:" + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();

	}

}
