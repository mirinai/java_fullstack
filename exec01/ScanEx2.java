package exec01;

import java.util.Scanner;

public class ScanEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하기: ");

		// 사용자로부터 문자열로 숫자를 입력받아, 이를 정수로 변환
		// Integer.parseInt : string -> integer
		int num = Integer.parseInt(sc.nextLine());
		System.out.printf("num :%d", num); // 변환된 정수를 출력

		// 정수를 문자열로 변환
		// Integer.toString : integer -> string
		String str1 = Integer.toString(1234);

		System.out.println(); // 개행

		int num3, num4;
		String str2;

		System.out.println("덧셈 계산기 입니다.");

		// 첫 번째 숫자를 입력받아 정수로 변환
		System.out.println("첫번째 숫자 입력");
		num3 = Integer.parseInt(sc.nextLine());

		// 두 번째 숫자를 입력받아 정수로 변환
		System.out.println("두번째 숫자 입력");
		num4 = Integer.parseInt(sc.nextLine());

		// 사용자로부터 이름을 입력받음
		System.out.println("이름 입력");
		str2 = sc.nextLine();

		// 입력된 이름과 두 숫자의 합계를 출력
		System.out.printf("%s가 만든 계산기의 연산결과 = %d", str2, num3 + num4);


	}

}
