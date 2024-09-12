package exec01;

import java.util.Scanner;

public class ScanEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("더하기 하기");

		// 사용자로부터 첫 번째 정수를 입력받음
		System.out.print("첫번째 정수 입력하기: ");
		int num1 = sc.nextInt();

		// 사용자로부터 두 번째 정수를 입력받음
		System.out.print("두번째 정수를 입력하기: ");
		int num2 = sc.nextInt();

		// 두 정수를 더한 결과를 출력함
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);

		System.out.println("-------------------------------");

		int num3, num4;
		String str;

		System.out.println("덧셈 계산기 입니다.");

		// 사용자로부터 첫 번째 숫자를 입력받음
		System.out.println("첫번째 숫자 입력");
		num3 = sc.nextInt();

		// 사용자로부터 두 번째 숫자를 입력받음
		System.out.println("두번째 숫자 입력");
		num4 = sc.nextInt();

		// 숫자 입력 후 남아 있는 개행 문자를 처리하기 위해 sc.nextLine()을 호출함
		System.out.println("이름 입력");
		sc.nextLine(); // 개행 문자를 제거하기 위해 필요함

		// 사용자로부터 이름을 입력받음
		str = sc.nextLine();

		// 입력받은 이름과 두 숫자의 합산 결과를 출력함
		System.out.printf("%s가 만든 계산기의 연산결과 = %d", str, num3 + num4);

		
		sc.close();
	  	}
}
