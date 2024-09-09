package do_it_algorithm_java_ch03_3;

import java.util.Scanner;

public class BinarySearch {

    // 이진 검색 메서드: 배열 a에서 key 값을 검색
    // key 값을 찾으면 해당 인덱스를 반환하고, 없으면 -1을 반환
    static int binarySearch(int[] a, int n, int key) {
        int pl = 0;  // 검색 범위의 왼쪽 끝 (첫 번째 인덱스)
        int pr = n - 1;  // 검색 범위의 오른쪽 끝 (마지막 인덱스)
        int result = -1;  // key 값을 찾은 인덱스를 저장 (초기값은 -1)

        // 이진 검색 반복문
        do {
            int pc = (pl + pr) / 2;  // 검색 범위의 중앙 인덱스
            if (a[pc] == key) {  // 중앙 값이 key 값과 같으면
                result = pc;  // 일단 key 값을 찾은 인덱스를 저장
                pr = pc - 1;  // 중복된 값이 있을 가능성 때문에 더 왼쪽을 탐색
            } else if (a[pc] < key) {  // 중앙 값이 key 값보다 작으면
                pl = pc + 1;  // 검색 범위를 오른쪽으로 이동
            } else {  // 중앙 값이 key 값보다 크면
                pr = pc - 1;  // 검색 범위를 왼쪽으로 이동
            }
        } while (pl <= pr);  // 검색 범위가 남아 있는 동안 반복

        return result;  // key 값을 찾은 인덱스 또는 -1 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위한 Scanner 객체 생성

        // 배열의 크기 입력
        System.out.print("요솟수: ");
        int num = sc.nextInt();  // 배열의 크기를 입력받음
        int[] x = new int[num];  // 입력받은 크기의 배열 생성

        System.out.println("오름차순으로 입력해야함");

        // 배열의 첫 번째 요소 입력
        System.out.print("x[0]: ");
        x[0] = sc.nextInt();  // 첫 번째 요소 값 입력

        // 배열의 나머지 요소 값을 입력받음
        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = sc.nextInt();  // 요소 값 입력
            } while (x[i] < x[i - 1]);  // 오름차순으로 입력할 때까지 반복
        }

        // 검색할 값 입력
        System.out.print("검색할 값: ");
        int key = sc.nextInt();  // 검색할 key 값 입력

        // 이진 검색 수행
        int idx = binarySearch(x, num, key);  // 배열 x에서 key 값을 이진 검색

        // 검색 결과 출력
        if (idx == -1) {
            System.out.println("그 값의 요소가 없음");  // key 값이 배열에 없을 경우
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있음");  // key 값이 배열에 있을 경우 해당 인덱스 출력
        }

        sc.close();  // Scanner 객체 닫기
    }
}

