package lt.lhu.unit06.main;

public class Task017 {

	public static void main(String[] args) {
		int n = 10;
		int [][]mass = new int [n][n];
		for (int i = 0; i< mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (i == 0 || i == n-1) {
					mass[i][j] = 1;
				}if (j == 0 || j == mass[i].length-1){	
					mass[i][j] = 1;
				}
			}
		}
		Task005.cheTam(mass);

	}

}
