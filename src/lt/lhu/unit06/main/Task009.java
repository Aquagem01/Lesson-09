package lt.lhu.unit06.main;

public class Task009 {

	public static void main(String[] args) {
		int a = 10;
		int[][] mass = new int[a][a];
		Task005.initRandomPos(mass);
		Task005.cheTam(mass);
		System.out.println();
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] == mass[i][i] || mass[i][j] == mass[i][mass[i].length - 1 - i]) {
					System.out.print("{" + mass[i][j] + "}");
				} else {
					System.out.print("      ");
				}

			}
			System.out.println();
		}

	}

}
