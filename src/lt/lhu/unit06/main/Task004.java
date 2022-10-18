package lt.lhu.unit06.main;

public class Task004 {

	public static void main(String[] args) {
		int a = 10;
		int [][] mass = new int [a][a];
		Task002.initRandom(mass);
		Task001.cheTamSqr(mass);
		System.out.printf("\n");
		for (int elem:mass[0]) {
			System.out.printf("[%3d]",elem);
		}System.out.printf("\n");
		for (int elem:mass[mass.length-1]) {
			System.out.printf("[%3d]",elem);
		}System.out.printf("\n");
	}

}
