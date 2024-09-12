package exec7;

public class ArrayScore {
	public static void main(String[] args) {
		
		// 학생별 과목 점수 배열 (4명의 학생, 3개의 과목: 국어, 영어, 수학)
		int[][] score = { { 20, 30, 40 }, { 50, 30, 30 }, { 20, 60, 40 }, {50,50,100}};
		// 각 과목의 총점을 저장할 배열 (국어, 영어, 수학 각각)
		int[] sumArr = {0,0,0};

		// 표의 머리 부분 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");

		// 학생별 점수 및 총점, 평균을 계산 및 출력
		for (int i = 0; i < score.length; i++) {
			// 학생 번호 출력 (1부터 시작)
			System.out.printf("%d", i + 1);
			for (int j = 0; j < score[i].length; j++) {
				System.out.print("\t");	
				
				// 과목별 점수 출력
				System.out.printf("%d", score[i][j]);

				// 각 과목별 점수를 sumArr 배열에 누적 (국어, 영어, 수학 총점 계산)
				sumArr[j] += score[i][j];
			}
			
			// 학생별 총점 출력 (국어, 영어, 수학 점수 합)
			System.out.print("\t");	
			System.out.printf("%d", score[i][0] + score[i][1] + score[i][2]);

			// 학생별 평균 출력 (총점을 과목 수로 나눈 값)
			System.out.print("\t");	
			System.out.printf("%.2f", (double)(score[i][0] + score[i][1] + score[i][2]) / score[i].length);
			System.out.println(); // 줄바꿈
		}
		
		// 주석 처리된 부분: 과목별 총점을 수동으로 계산한 코드
		// for (int i = 0; i < score[0].length; i++) {
		//     sumArr[i] = score[0][i] + score[1][i] + score[2][i] + score[3][i];
		// }

		// 각 과목의 총점 출력 (sumArr 배열에 저장된 값)
		System.out.printf(" \t%d\t%d\t%d", sumArr[0], sumArr[1], sumArr[2]);
	}
}

