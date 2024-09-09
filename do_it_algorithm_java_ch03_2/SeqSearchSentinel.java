package do_it_algorithm_java_ch03_2;

import java.util.Scanner;

public class SeqSearchSentinel {
	
	/** 
	 * 센티넬 기법을 사용한 순차 검색 메서드
	 * 배열 a에서 key 값을 찾으면 해당 인덱스를 반환하고, 없으면 -1을 반환
	 * 배열 끝에 센티넬 값을 추가하여 경계 검사를 제거함
	 */
	static int SeqSearchSentinel(int[] a,int n, int key) {
		int i = 0;  // 인덱스 초기화
		
		a[n] = key; // 배열의 끝(n번째)에 key 값을 센티넬로 추가
		
		// 무한 루프를 돌며 배열에서 key 값을 찾을 때까지 탐색
		while (true) {
			if(a[i] == key) {  // 현재 인덱스에 key 값이 있으면 루프 종료
				break;
			}
			i++;  // 인덱스를 하나씩 증가시키며 탐색
		}
		
		// 만약 key 값을 찾은 인덱스가 배열의 끝(n)이라면 값이 없는 것이므로 -1 반환, 그렇지 않으면 인덱스 반환
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		// 사용자 입력을 받기 위한 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 배열의 크기(요솟수)를 입력받음
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num + 1]; // 배열 크기를 입력받은 값보다 1 크게 설정 (센티넬 위치 확보)
		
		// 배열의 각 요소 값을 입력받기
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt(); // 각 배열 요소 값을 사용자가 입력
		}
		
		// 검색할 값을 입력받기
		System.out.print("검색할 값: ");
		int key = sc.nextInt(); // 사용자가 검색할 key 값을 입력
		
		// 검색 수행
		int idx = SeqSearchSentinel(x, num, key); // 배열 x에서 key 값을 검색
		
		// 검색 결과 출력
		if (idx == -1) {
			System.out.println("그 값의 요소가 없다."); // key 값이 배열에 없을 경우
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있다."); // key 값이 배열에 있을 경우 해당 인덱스를 출력
		}

		// Scanner 객체 닫기 (자원 해제)
		sc.close();
	}
}
