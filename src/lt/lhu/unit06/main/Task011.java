package lt.lhu.unit06.main;

public class Task011 {

	public static void main(String[] args) {
		int m = 5;
		int n = 7;
		int[][]mass = new int[m][n];
		Task005.initRandomPos(mass);
		Task005.cheTam(mass);
		System.out.println();
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass[i].length; j++) {
					if (i == 0 || i%2 == 0) {
						System.out.printf("{%4d}", mass [i][mass[i].length-1-j]);
					}if (i%2 != 0) {
						System.out.printf("{%4d}", mass [i][j]);
					}
				}System.out.println();
			}
		
	}

}
