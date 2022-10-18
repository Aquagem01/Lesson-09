package lt.lhu.unit06.main;

import java.util.Random;

public class Task010 {

	public static void main(String[] args) {
		int a = 10;
		int[][]mass = new int [a][a];
		Task005.initRandomPos(mass);
		Task005.cheTam(mass);
		System.out.println();
		Random rand = new Random();
		int k = rand.nextInt (a-1);
		int p = rand.nextInt (a-1);
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (i == k) {
					System.out.printf("{%4d}",mass[i][j]);
				}
			}
		}
		System.out.println();
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (j == p) {
					System.out.printf("\n{%4d}",mass[i][j]);
				}
			}
		}
		
	}

}
