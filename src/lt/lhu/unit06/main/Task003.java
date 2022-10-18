package lt.lhu.unit06.main;

public class Task003 {

	public static void main(String[] args) {
		int a = 10;
		int[][] mass = new int[a][a];
		Task002.initRandom(mass);
		Task001.cheTamSqr(mass);
		System.out.print("\n");
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (j == 0) {
					System.out.printf("{%3d}", mass[i][j]);
				}
				if (j == mass[i].length - 1) {
					System.out.printf("{%3d}", mass[i][j]);
				}

			}
			System.out.print("\n");
		}

	}
}
