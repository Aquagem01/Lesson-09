package lt.lhu.unit06.main;

import java.util.Random;

public class Task005 {

	public static void main(String[] args) {
		int a = 10;
		int[][] mass = new int[a][a];
		initRandomPos(mass);
		cheTam(mass);
		System.out.println();
		for (int i = 1; i < mass.length; i = i + 2) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.printf("[%4d]", mass[i][j]);
			}
			System.out.println();
		}
	}

	public static void initRandomPos(int[][] mass) {
		Random rand = new Random();
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = rand.nextInt(999);
			}
		}

	}

	public static void cheTam(int[][] mass) {
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.printf("{%4d}", mass[i][j]);
			}
			System.out.println();
		}
	}
	
}
