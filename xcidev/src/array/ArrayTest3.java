package array;

public class ArrayTest3 {
	public static void main(String[] args) {

		int[][] score = { { 100, 90, 80, 70 }, { 90, 80, 70, 60 }, { 80, 70, 60, 50 } };
		int sum = 0;

		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");

		for (int row = 0; row < score.length; row++) {
			sum = 0;
			for (int col = 0; col < score[row].length; col++) {
				sum += score[row][col];
				System.out.print(score[row][col] + "\t");
			}
			System.out.println(sum + "\t" + (float) (sum / score[row].length));
		}

		System.out.println();

		int[][][] score2 = { { { 100, 90, 80, 70 }, { 90, 80, 70, 60 }, { 80, 70, 60, 50 } },
				{ { 100, 100, 90, 80 }, { 100, 90, 80, 70 }, { 90, 80, 70, 60 } } };
		int sum2 = 0;

		for (int table = 0; table < score2.length; table++) {
			System.out.println((table + 1) + "학기");
			System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
			for (int row = 0; row < score2[table].length; row++) {
				sum2 = 0;
				for (int col = 0; col < score2[table][row].length; col++) {
					sum2 += score2[table][row][col];
					System.out.print(score2[table][row][col] + "\t");
				}
				System.out.println(sum2 + "\t" + (float) (sum2 / 4));
			}
			System.out.println();
		}

	}
}
