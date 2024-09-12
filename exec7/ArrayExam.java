package exec7;

public class ArrayExam {
	public static void main(String[] args) {
		int[] scores = { 91, 82, 75 };

		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("다 더한 값 = " + sum);

		System.out.printf("average = %.2f\n", sum / (double) 3);
		String[] season = { "spring", "summer", "fall", "winter" };

		System.out.println("season[0]: " + season[0]);

		System.out.println();

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
			System.out.println("numArr[" + i + "]: " + numArr[i]);
		}

		System.out.println();

		
		
	}
}
