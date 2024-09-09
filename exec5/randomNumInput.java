package exec5;

import java.util.Random;
import java.util.Scanner;

public class randomNumInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1부터 50까지의 난수 생성
		int randomNum = (int)(Math.random() * 50) + 1;  
//		System.out.println(randomNum);  // 난수를 출력하는 디버깅용 주석 (필요시 활성화 가능)
		
		int counter = 0;  // 오답 횟수를 기록할 변수
		int num = -1;  // 사용자가 입력한 숫자를 저장할 변수 (초기값은 -1로 설정하여 randomNum과 다르게 시작)

		// 사용자가 정답을 맞출 때까지 반복
		while (randomNum != num) {
			// 사용자로부터 1~50 사이의 숫자 입력받기
			System.out.print("1~50까지 아무 숫자 하나 넣기: ");
			num = sc.nextInt();  // 숫자 입력받기

			// 입력받은 숫자가 정답보다 작은 경우
			if (randomNum > num) {
				System.out.println("큰 수를 입력하세요");
				counter++;  // 오답 횟수 증가
			}
			// 입력받은 숫자가 정답보다 큰 경우
			else if (randomNum < num) {
				System.out.println("작은 수를 입력하세요");
				counter++;  // 오답 횟수 증가
			}
		}

		// 정답을 맞췄을 경우 출력
		System.out.printf("%d가 정답임\n오답횟수: %d", num, counter);
	}
}

