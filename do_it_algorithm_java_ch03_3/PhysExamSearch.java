package do_it_algorithm_java_ch03_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

	// PhyscData 클래스 정의
	static class PhyscData {
		private String name;    // 이름
		private int height;     // 키
		private double vision;  // 시력

		// 생성자: 객체 생성 시 이름, 키, 시력을 초기화
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		// toString 메서드: 객체를 출력할 때 호출되어 데이터 반환
		public String toString() {
			return name + " " + height + " " + vision;
		}

		// 키(height)를 기준으로 객체를 비교하는 Comparator
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
	}

	// HeightOrderComparator: 키를 기준으로 두 PhyscData 객체를 비교
	private static class HeightOrderComparator implements Comparator<PhyscData> {
		// 두 PhyscData 객체를 비교하여 키가 큰 경우 1, 작은 경우 -1, 같으면 0 반환
		public int compare(PhyscData d1, PhyscData d2) {
			return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// PhyscData 배열 생성 (이름, 키, 시력 포함)
		PhyscData[] x = { 
			new PhyscData("지훈", 180, 1.2), 
			new PhyscData("민지", 165, 1.0), 
			new PhyscData("철수", 172, 0.8),
			new PhyscData("영희", 158, 1.5), 
			new PhyscData("동욱", 185, 1.0), 
			new PhyscData("수현", 170, 0.9),
			new PhyscData("가영", 160, 1.3), 
			new PhyscData("준호", 175, 1.4), 
			new PhyscData("하린", 155, 1.6),
			new PhyscData("예준", 182, 0.7), 
			new PhyscData("서연", 167, 1.0) 
		};
		
		// 배열을 키(height) 기준으로 정렬 (이진 검색을 위해 반드시 필요)
		Arrays.sort(x, PhyscData.HEIGHT_ORDER);

		// 사용자로부터 찾고 싶은 키(height) 입력받기
		System.out.print("찾고 싶은 키를 입력하기: ");
		int height = Integer.parseInt(sc.nextLine());

		// 이진 검색 수행: 입력받은 키(height)와 같은 값을 배열에서 검색
		int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

		// 검색 결과 출력: 찾은 값이 있으면 해당 인덱스와 데이터를 출력, 없으면 "그 값의 요소가 없음"
		if (idx < 0) {
			System.out.println("그 값의 요소가 없음");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있음");
			System.out.println("찾은 데이터: " + x[idx]);
		}

		sc.close(); // 스캐너 닫기
	}
}
