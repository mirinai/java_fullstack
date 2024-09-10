package exec5;

import java.util.Scanner;

public class PracticeProblems {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("문자입력: ");
//		char ch1 = sc.next().charAt(0);
//		char isChar1 = '\t';
//		System.out.printf("%b",isChar1=='\t');
//		System.out.println();
//		System.out.printf("%b",isChar1==' ');
//		System.out.println();
//		char isChar2 = ' ';
//		System.out.printf("%b",isChar2=='\t');
//		System.out.println();
//		System.out.printf("%b",isChar2==' ');
//		System.out.println();
//		System.out.printf("%c\n",'0');
//		System.out.printf("%c\n",'9');
		System.out.println("--------------4-3----------------");
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+...+10)
		// i가 0부터 9까지, j는 1부터 i까지 반복하여 1부터 i까지의 합을 구하는 구조
		int sum = 0;
		int cnt = 0;

		for (int i = 1; i < 11; i++) {
		    // i 번째 루프에서 1부터 i까지 더함
		    for (int j = 1; j <= i; j++) {
		        sum = sum + j; // 합계에 j 더하기
		        cnt++; // 연산 횟수를 세는 변수
		    }
		}

		System.out.printf("sum: %d, count: %d\n", sum, cnt); // 총합과 연산 횟수 출력

		System.out.println("--------------4-4----------------");
		// 1+(-2)+3+(-4)+... (홀수는 양수, 짝수는 음수로 더하기)
		sum = 0;
		cnt = 0;

		for (int i = 1; i <= 10; i++) { // 1부터 10까지 반복
		    if (i % 2 == 0) { // 짝수일 때 음수로 더하기
		        sum += -i;
		    } else { // 홀수일 때 양수로 더하기
		        sum += i;
		    }
		}

		System.out.println("합계: " + sum); // 최종 합계 출력

		System.out.println("-----------------4-9-----------------");
		String str = "12345";

		sum = 0;

		// 문자열의 각 문자를 숫자로 변환하여 더하는 부분
		for (int i = 0; i < str.length(); i++) {
		    // 문자열의 각 문자를 숫자로 변환하여 출력
		    System.out.printf("%s", Integer.parseInt(str.valueOf(str.charAt(i))));
		    // 각 문자를 숫자로 변환해 합계에 더함
		    sum += Integer.parseInt(str.valueOf(str.charAt(i)));
		    
		    // 마지막 문자가 아닌 경우 "+" 출력
		    if (i + 1 != str.length()) {
		        System.out.print("+");
		    }
		}
		System.out.println("\nsum = " + sum); // 최종 합계 출력

		System.out.println("-----------------4-10-----------------");

		int num = 12345;
		sum = 0;

		int len = Integer.toString(num).length(); // 숫자의 자릿수를 구함
		int digit = 0;

		// 자릿수를 하나씩 나누어 출력하고 더하는 부분
		for (int i = len - 1; i >= 0; i--) {
		    // 자릿수를 추출
		    digit = num / (int) Math.pow(10, i) % 10;
		    System.out.printf("%d", digit); // 자릿수를 출력
		    sum = sum + digit; // 자릿수를 더함
		    
		    // 마지막 자릿수 전까지 "+" 출력
		    if (i > 0) {
		        System.out.print("+");
		    }
		}

		System.out.print("\n");
		System.out.println("sum = " + sum); // 최종 합계 출력

		System.out.println("-----------------4-11-----------------");
		// 피보나치 수열 생성
		int num1 = 1; // 첫 번째 피보나치 숫자
		int num2 = 1; // 두 번째 피보나치 숫자
		int num3 = 0; // 세 번째 피보나치 숫자를 저장할 변수
		int temp = 0; // 필요하지 않은 변수지만 코드에 남겨둠

		// 첫 번째와 두 번째 피보나치 수를 더한 값을 출력
		System.out.printf("num1+num2: %d", num1 + num2);
		System.out.println();
		System.out.println();

		// 첫 두 개의 피보나치 숫자 출력
		System.out.print(num1 + ", " + num2 + ", ");

		for (int i = 0; i < 8; i++) {
		    // 피보나치 수열의 다음 항 계산
		    num3 = num1 + num2;
		    
		    // 다음 항 출력
		    System.out.printf("%d", num3);
		    System.out.print(", ");
		    
		    // num1과 num2 업데이트 (다음 수를 계산하기 위해)
		    num1 = num2;
		    num2 = num3;
		}

		// 입력을 받는 Scanner 객체 종료 (코드에서 sc 선언이 안 보이므로 주석 처리 필요)
		// sc.close();

	}

}
