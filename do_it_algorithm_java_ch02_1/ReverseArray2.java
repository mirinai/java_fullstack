package do_it_algorithm_java_ch02_1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray2 {
    
    // 배열의 두 요소를 교환하는 메서드
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];      // idx1의 값을 임시 변수 t에 저장
        a[idx1] = a[idx2];    // idx2의 값을 idx1에 대입
        a[idx2] = t;          // 임시 변수 t의 값을 idx2에 대입 (교환 완료)
    }

    // 배열을 거꾸로 뒤집는 메서드
    static void reverse(int[] a) {
        // 배열의 절반만 반복하면서 앞과 뒤의 요소를 교환
        for (int i = 0; i < a.length / 2; i++) {
            // 교환할 두 요소의 인덱스를 출력
            System.out.printf("a[%d]와 a[%d]를 서로 바꾸기\n", i, a.length - i - 1);
            // 교환 전의 두 요소의 값을 출력
            System.out.printf("a[%d] = %d, a[%d] = %d\n", i, a[i], a.length - i - 1, a[a.length - i - 1]);
            // 현재 배열 상태를 출력
            System.out.println("a= " + Arrays.toString(a));
            
            // 배열의 두 요소를 교환
            swap(a, i, a.length - i - 1);
            System.out.println("스왑함");  // 교환이 완료되었음을 출력
            
            // 교환 후의 두 요소의 값을 출력
            System.out.printf("a[%d] = %d, a[%d] = %d\n", i, a[i], a.length - i - 1, a[a.length - i - 1]);
            // 교환 후 배열 상태를 출력
            System.out.println("a= " + Arrays.toString(a));
            System.out.println();  // 한 줄 띄우기
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위한 Scanner 객체 생성

        // 배열의 크기를 입력받음
        System.out.print("element의 수: ");
        int num = sc.nextInt();  // 배열의 크기를 num에 저장

        // 입력받은 크기만큼의 배열 생성
        int[] x = new int[num];

        // 배열의 각 요소를 사용자로부터 입력받음
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();  // 배열의 각 인덱스에 값을 저장
        }

        // 배열을 반전시키는 reverse 메서드 호출
        reverse(x);

        // 반전된 배열을 출력
        System.out.println("element를 서로 거꾸로 넣음");
        System.out.println("x= " + Arrays.toString(x));  // 배열을 문자열로 출력
        sc.close();
    }
}
