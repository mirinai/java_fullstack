package do_it_algorithm_java_ch03_2;

import java.util.Scanner;

public class SeqSearchFor {
	static int seqSearch(int[] a, int n, int key) {
//        int i = 0; // 배열의 인덱스를 나타내는 변수
//        while (true) {
//            // 배열 끝까지 검색했는데도 찾지 못하면 -1 반환
//            if (i == n) {
//                return -1; // key 값이 배열에 없을 경우
//            }
//            // 배열의 현재 인덱스에 있는 값이 key와 같으면 해당 인덱스 반환
//            if (a[i] == key) {
//                return i; // key 값이 배열에 있을 경우 해당 인덱스 반환
//            }
//            i++; // 다음 요소로 이동
//        }
		
		for (int i = 0;i<n;i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
    }
	public static void main(String[] args) {
		// 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 배열의 크기(요솟수) 입력
        System.out.print("요솟수: ");
        int num = sc.nextInt(); // 배열의 크기 입력받음

        // 입력받은 크기만큼의 배열 생성
        int[] x = new int[num];

        // 배열에 각 요소 값 입력받기
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt(); // 각 배열의 요소 값을 입력받음
        }

        // 검색할 값을 입력받기
        System.out.print("검색할 값: ");
        int key = sc.nextInt(); // 검색할 key 값 입력받음

        // 검색 수행
        int idx = seqSearch(x, num, key); // 배열 x에서 key 값을 검색

        // 검색 결과 출력
        if (idx == -1) {
            System.out.println("그 값의 요소가 없다."); // key 값이 배열에 없을 경우
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있다."); // key 값이 배열에 있을 경우 해당 인덱스 출력
        }

        sc.close(); // Scanner 객체 닫기
	}
}
