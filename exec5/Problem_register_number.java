package exec5;

import java.util.Scanner;

public class Problem_register_number {
	public static void main(String[] args) {
		/*
		 * 1. 주민번호를 입력받아 남자인지 여자인지 출력하는 프로그램
		 * 2. 주민번호 예시: 901231-4447777
		 * 3. 'exit'을 입력하면 프로그램을 종료
		 */
		
		char gen = 0;        // 성별을 판별할 문자 저장 변수
		String regNo = null;  // 입력받은 주민번호 저장 변수
		Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위한 Scanner 객체 생성
		
		do {
			// 주민번호 입력 받기
			System.out.print("주민번호 입력하기: ");
			regNo = sc.nextLine();  // 사용자로부터 입력받은 주민번호를 regNo에 저장
			
			// 'exit'을 입력하면 프로그램 종료
			if (regNo.contains("exit")) {
				System.out.println("프로그램 나감");
				break;  // 반복문 종료
			}

			// 주민번호의 7번째 문자를 성별 판별에 사용
			gen = regNo.charAt(7);

			// 주민번호 7번째 문자를 기준으로 성별 출력
			switch (gen) {
			case '1':
			case '3':
				// 7번째 문자가 '1' 또는 '3'일 때 남자
				System.out.println("남자");
				break;
			case '2':
			case '4':
				// 7번째 문자가 '2' 또는 '4'일 때 여자
				System.out.println("여자");
				break;
			default:
				// 그 외의 값은 처리하지 않음
				break;
			}

		} while (true);  // 'exit' 입력 전까지 계속 반복

		sc.close(); // Scanner 닫기, 자원 해제
	}
}