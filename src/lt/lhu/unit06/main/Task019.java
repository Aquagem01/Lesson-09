package lt.lhu.unit06.main;

public class Task019 {

	public static void main(String[] args) {
		int n = 10;
		int [][] mass = new int [n][n];
		for (int i = 0; i < mass.length; i ++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (j >= i && j < n - i) {
					mass[i][j] = 1;
				}if (j <= i && j > n-i-2) {// решил в итоге путем подбора - почему минус 2 так и не понял )))
					mass[i][j] = 1;
				}
					
			}
					
		}
		Task005.cheTam(mass);
	}

}


