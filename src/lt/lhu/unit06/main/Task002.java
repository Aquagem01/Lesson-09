package lt.lhu.unit06.main;

import java.util.Random;

public class Task002 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int[][] mass = new int[a][b];
		initRandom(mass);
		Task001.cheTamSqr(mass);
	}

	public static void initRandom(int[][] mass) {
		Random rand = new Random();
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = rand.nextInt(0, 9);
			}
		}
	}
}
