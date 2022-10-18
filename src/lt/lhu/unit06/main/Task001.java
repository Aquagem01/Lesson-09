package lt.lhu.unit06.main;

public class Task001 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int[][] mass = new int[a][b];
		for (int i = 0; i <= a - 1; i++) {
			mass[i][i] = 1;
		}
		cheTamSqr(mass);
	}

	public static void cheTamSqr(int[][] mass) {
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.printf("{%3d}", mass[i][j]);
			}
			System.out.print("\n");
		}

	}
}
