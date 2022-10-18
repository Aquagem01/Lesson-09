package lt.lhu.unit06.main;

import java.util.Random;

public class Task007 {

	public static void main(String[] args) {
		int a = 5;
		int [][]mass = new int [a][a];
		initRandomNegative(mass);
		Task005.cheTam(mass);
		int sum = 0;
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] < 0 && mass [i][j]%2 != 0) {
						sum = sum + Math.abs (mass[i][j]);
						System.out.print("\nSum:" +sum);
					
				}
			}
		}

	}

	public static void initRandomNegative (int [][] mass) {
		Random rand = new Random();
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = rand.nextInt(10) - 5;
			}
		}
	}
	
}
