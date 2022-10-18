package lt.lhu.unit06.main;

public class Task016 {

	public static void main(String[] args) {
		int n = 10;
		int [][]mass = new int [n][n];
		for (int i = 0; i< mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (i == j) {
					mass[i][j] = (i+1)*(i+2);
				}
			}
		}
		Task005.cheTam(mass);

	}

}
