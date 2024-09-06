package do_it_algorithm_java_ch02_1;

import java.util.Scanner;

public class CardConv {

    // 10진수를 r진수로 변환하고 변환된 자릿수를 반환하는 메서드
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;  // 변환된 숫자의 자릿수를 세는 변수

        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";  // 최대 36진수까지 변환할 수 있는 문자 집합
        char temp;  // 배열의 자리를 교환할 때 사용하는 임시 변수

        do {
        	
        	if(digits == 0) {
        		System.out.printf("%d|%6d\n",r,x);
        	}
        	else {
        		System.out.printf("%d|%6d  ---\t%d\n",r,x,x % r);	
        	}
        	System.out.println("+----------------");
        	
        	
        	
        	
            // x를 r진수로 변환하여 나머지를 구한 후 해당하는 문자를 d 배열에 저장
            d[digits++] = dchar.charAt(x % r);  // 나머지로 변환된 문자를 d 배열에 저장하고 자리수 증가
            
            
            
            x /= r;  // x를 r로 나눠 몫을 구함 (다음 자릿수를 처리하기 위해)

        } while (x != 0);  // x가 0이 될 때까지 반복 (모든 자릿수가 처리될 때까지)

        // 변환된 배열은 역순으로 저장되므로 이를 바로잡기 위해 배열을 뒤집음
        for (int i = 0; i < digits / 2; i++) {  // 배열의 절반만큼 반복하면서 앞과 뒤를 교환
            temp = d[i];  // 임시로 d[i] 값을 저장
            d[i] = d[digits - i - 1];  // 끝의 값을 앞으로 이동
            d[digits - i - 1] = temp;  // 임시 저장한 값을 뒤로 이동
        }

        return digits;  // 변환된 숫자의 자릿수를 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 입력을 받기 위한 Scanner 객체 생성

        int no;    // 변환할 정수
        int cd;    // 변환할 진수
        int dno;   // 변환된 숫자의 자릿수
        int retry; // 프로그램을 반복할지 여부를 저장하는 변수
        char[] cno = new char[32];  // 변환된 결과를 저장할 배열 (최대 32자릿수까지)

        System.out.println("10진수를 기수변환하기");  // 프로그램 설명 출력

        do {
            // 변환할 정수를 입력받음 (음수가 아닌 값을 받을 때까지 반복)
            do {
                System.out.print("마이너스가 아닌 변환할 정수: ");
                no = sc.nextInt();  // 변환할 10진수 입력
            } while (no < 0);  // 음수일 경우 다시 입력 받음

            System.out.println();

            // 변환할 진수를 입력받음 (2~32 사이의 진수만 가능)
            do {
                System.out.print("어떤 진수로 변환할지 고르기(2~32): ");
                cd = sc.nextInt();  // 변환할 진수를 입력받음
            } while (cd < 2 || cd > 32);  // 2~32 이외의 값은 다시 입력 받음

            // 입력받은 정수와 진수를 이용해 변환 수행
            dno = cardConv(no, cd, cno);  // 변환된 결과의 자릿수 반환

            // 변환 결과를 출력
            System.out.println(cd + "진수로 바꾸기");
            for (int i = 0; i < dno; i++) {  // 변환된 자릿수를 순서대로 출력
                System.out.print(cno[i]);
            }
            System.out.printf("(%d진수)(이)다.\n", cd);  // 변환된 진수 표시

            // 변환 작업을 다시 할지 묻기
            System.out.print("한번 더 하기(예: 1, 아니오: 2): ");
            retry = sc.nextInt();  // 다시 할지 입력받음
        } while (retry == 1);  // 입력값이 1이면 반복, 그렇지 않으면 종료
    }
}
