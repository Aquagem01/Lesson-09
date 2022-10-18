package lt.lhu.unit06.main;

public class Task013 {

	public static void main(String[] args) {
		int n = 10;
		int [][]mass = new int [n][n];
		for (int i = 0; i< mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (i == 0 || i%2 == 0) {
					mass [i][j] = j+1;
				}if (i%2 !=0) {
					mass [i][j] = mass[i].length - j;
				}
			}
		}
		Task005.cheTam(mass);
	}

}
