package do_it_algorithm_java_ch02_1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	// 배열의 두 요소를 교환하는 메서드
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];     // idx1 위치의 값을 임시 변수 t에 저장
        a[idx1] = a[idx2];   // idx2 위치의 값을 idx1에 대입
        a[idx2] = t;         // t에 저장된 값을 idx2에 대입 (두 값 교환)
    }

    // 배열을 거꾸로 뒤집는 메서드
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) { // 배열의 절반만 교환 (중복 방지)
            swap(a, i, a.length - i - 1);       // i번째와 끝에서 i번째 요소를 교환
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위한 Scanner 객체 생성

        System.out.print("element의 수: ");
        int num = sc.nextInt();               // 배열의 크기 입력받기

        int[] x = new int[num];               // 입력받은 크기만큼의 배열 생성

        // 배열의 각 요소를 사용자로부터 입력받기
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();              // x[i]에 값 저장
        }

        reverse(x);                           // 배열 x를 뒤집는 함수 호출

        // 배열을 거꾸로 뒤집은 결과 출력
        System.out.println("element를 서로 거꾸로 넣음");
        System.out.println("x= " + Arrays.toString(x));  // 배열을 문자열로 출력
        sc.close();
	}

}
