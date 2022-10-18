package lt.lhu.unit06.main;

public class Task006 {

	public static void main(String[] args) {
		int a = 10;
		int[][] mass = new int[a][a];
		Task005.initRandomPos(mass);
		Task005.cheTam(mass);
		System.out.println();
		for (int i = 0; i < mass.length; i ++) {
			for (int j = 0; j < mass[i].length; j = j + 2) {
				if (mass[0][j] > mass[mass.length - 1][j]) {
					System.out.printf("{%4d}", mass[i][j]);
				}
			}System.out.println();
		}
	}

}
