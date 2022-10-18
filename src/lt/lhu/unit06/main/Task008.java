package lt.lhu.unit06.main;

public class Task008 {

	public static void main(String[] args) {
		int n = 20;
		int m = 30;
		int[][] mass = new int[n][m];
		Task005.initRandomPos(mass);
		Task005.cheTam(mass);
		int count = findCount(mass);
		System.out.print("Number 7 - " + count);

	}

	public static int findCount(int[][] mass) {
		int count = 0;
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] == 7) {
					count++;
				}
			}
		}
		return count;
	}

}
