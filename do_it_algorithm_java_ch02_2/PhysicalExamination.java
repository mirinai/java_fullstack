package do_it_algorithm_java_ch02_2;

import java.util.Scanner;

public class PhysicalExamination {
	static final int VMAX = 21; // 시력 분포에서 사용할 최대 시력 값의 배수 (0.0~2.0의 범위를 표현하기 위해 21 사용)

	// 신체 데이터(이름, 키, 시력)를 담는 클래스
	static class PhyscData {
		String name;   // 이름
		int height;    // 키
		double vision; // 시력

		// PhyscData 클래스의 생성자 (이름, 키, 시력 데이터를 초기화)
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	// 키의 평균을 계산하는 메서드
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;

		// 모든 사람의 키를 합산
		for (int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		// 키의 총합을 인원수로 나누어 평균 계산
		return sum / dat.length;
	}

	// 시력 분포를 계산하는 메서드
	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;
		dist[i] = 0; // 초기화

		// 각 사람의 시력을 시력 분포 배열에 반영
		for (i = 0; i < dat.length; i++) {
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) { // 0.0 <= 시력 <= 2.0
				// 시력 값을 배열 인덱스로 사용하여 해당 시력의 사람 수를 증가
				dist[(int) (dat[i].vision * 10)]++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 신체 데이터를 담고 있는 PhyscData 객체 배열 선언 및 초기화
		PhyscData[] x = {
			new PhyscData("sam", 162, 0.3), 
			new PhyscData("john", 178, 0.5), 
			new PhyscData("edward", 176, 0.7),
			new PhyscData("james", 179, 0.9), 
			new PhyscData("natasha", 168, 1.1), 
			new PhyscData("cyncia", 165, 0.5),
			new PhyscData("rachel", 162, 0.6)
		};

		// 시력 분포를 저장할 배열 선언 (0.0 ~ 2.0 시력의 인원을 카운트하는 배열)
		int[] vdist = new int[VMAX];

		// 신체 검사 결과 출력
		System.out.println("신체 검사 리스트");
		System.out.println("이름	키	시력");
		System.out.println("---------------------");

		// 각 사람의 신체 데이터를 출력
		for (int i = 0; i < x.length; i++) {
			// 이름은 좌측 정렬, 키는 3자리, 시력은 소수점 한 자리까지 출력
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}

		// 키의 평균값 출력
		System.out.printf("평균 키: %5.1f", aveHeight(x));

		// 시력 분포 계산
		distVision(x, vdist);

		// 시력 분포 출력
		System.out.println("\n시력분포");
		for (int i = 0; i < VMAX; i++) {
			// 시력 범위별로 해당하는 인원 수 출력 (0.0~2.0 시력을 0.1 간격으로)
			System.out.printf("%3.1f~: %2d명\n", i / 10.0, vdist[i]);
		}
	}
}

